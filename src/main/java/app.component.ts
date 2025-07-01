import { Component, OnInit } from '@angular/core';
import * as CodeMirror from 'codemirror';
import CustomLangLexer from './CustomLangLexer';
import { CharStreams, CommonTokenStream, Token } from 'antlr4';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  
  ngOnInit(): void {
    this.initLang();
    this.query = `\`Số nguyên\` = 5
\`Số thực\`  = 5.5
\`Ds mảng\` = [1,2,3,4]
Nếu \`Số nguyên\` == 5:
    \`Số nguyên\`= 10
Duyệt \`Mảng\` trong \`Ds mảng\`:
    \`So mang\` = 21
    \`Số nguyên\` = 1
Lặp \`So mang\` < 11:
    \`Số nguyên\` = \`Số nguyên\` + 1`;
  }
  query: string;
  codeMirrorOptions: any = {
    mode: "text/x-customlang",
    indentWithTabs: true,
    smartIndent: true,
    lineNumbers: true,
    lineWrapping: false,
    extraKeys: { "Ctrl-Space": "autocomplete" },
    gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"],
    autoCloseBrackets: true,
    matchBrackets: true,
    lint: true
  };


  setEditorContent(event: any) {
    console.log(this.query);
  }



  initLang(){
    // src/modes/customlang/customlang-mode.ts

// --- Định nghĩa các Regex cho loại token của ngôn ngữ của bạn ---
// Bạn có thể điều chỉnh hoặc thêm các regex này dựa trên grammar của bạn.

// Từ khóa chính
const keywords = new RegExp("^(Nếu|Ngược lại|Lặp|trong|Duyệt|khi|hàm|biến|hằng|return)\\b");

// Toán tử
const operators = new RegExp("^(?:[:=]|\\+|-|\\*|/|==|!=|>|<|>=|<=|\\.)"); // Bao gồm cả .

// Dấu câu (Delimiters)
const delimiters = new RegExp("^[()\\[\\]{},;:]");

// Số (Decimal, Float, Hex, Binary, Octal)
const numbers = new RegExp("^(?:0x[0-9a-fA-F]+|0b[01]+|0o[0-7]+|[0-9]+(?:\\.[0-9]+)?(?:e[\\+\\-]?\\d+)?)\\b");

// Chuỗi (đặc biệt là chuỗi backtick của bạn)
// `([^`\\]|\\.)*` : Chuỗi bắt đầu bằng `, kết thúc bằng `, cho phép ký tự bất kỳ trừ ` và \, nhưng cho phép \.
// "([^"\\]|\\.)*" : Chuỗi bắt đầu bằng ", kết thúc bằng ", cho phép ký tự bất kỳ trừ " và \, nhưng cho phép \.
// '([^'\\]|\\.)*' : Chuỗi bắt đầu bằng ', kết thúc bằng ', cho phép ký tự bất kỳ trừ ' và \, nhưng cho phép \.
const strings = new RegExp("^(?:`([^`\\\\]|\\\\.)*`|\"([^\"\\\\]|\\\\.)*\"|'([^'\\\\]|\\\\.)*')");

// Định danh (Không cần ` ` ở đây vì đã xử lý ở `strings` nếu bạn muốn `my_var` không có backtick)
// Nếu định danh của bạn luôn yêu cầu backtick, bạn có thể loại bỏ regex này
// và chỉ dùng regex `strings` ở trên, sau đó gán class "variable" cho nó.
// Nếu định danh CÓ THỂ không có backtick (NHƯNG grammar của bạn lại yêu cầu),
// thì bạn phải sửa grammar. Với hiện tại, chúng ta giả định IDENTIFIER CÓ backtick.
// Vậy nên, tôi sẽ không định nghĩa regex cho identifier không backtick.
// Nếu bạn muốn highlight "my_var" không có backtick là variable, bạn cần sửa grammar.

// Hoặc nếu bạn muốn IDENTIFIER KHÔNG CÓ backtick (và grammar của bạn hỗ trợ):
// const identifiers = new RegExp("^[A-Za-z_][A-Za-z0-9_]*\\b");

// Comment (dòng đơn, bắt đầu bằng #)
const comments = new RegExp("^#.*");

// --- Hàm chính định nghĩa CodeMirror Mode ---
CodeMirror.defineMode('customlang', (config: any, parserConfig: any): any => {
    // startState được gọi mỗi khi một mode mới được bắt đầu (hoặc refresh)
    // Nó trả về đối tượng `state` sẽ được truyền vào hàm `token` và `copyState`.
    return {
        startState: function(): any {
            return {
                inString: false, // Để theo dõi nếu chúng ta đang trong một chuỗi nhiều dòng
                stringDelimiter: null // Loại delimiter của chuỗi hiện tại (` hoặc " hoặc ')
            };
        },

        // copyState được gọi khi CodeMirror cần tạo một bản sao của trạng thái hiện tại (ví dụ: để tối ưu hóa)
        copyState: function(state: any): any {
            return {
                inString: state.inString,
                stringDelimiter: state.stringDelimiter
            };
        },

        // Hàm token là trái tim của CodeMirror Mode. Nó được gọi cho từng "miếng" văn bản.
        token: function(stream: CodeMirror.StringStream, state: any): string | null {
  const currentLineText = stream.string;
            let currentStreamPos = stream.pos; // Lấy vị trí hiện tại của stream

            // Nếu đây là lần đầu tiên gọi `token` cho một dòng mới,
            // hoặc nội dung của dòng đã thay đổi, chúng ta cần lex lại dòng đó.
            if (currentStreamPos === 0 && state.currentLineTextCache !== currentLineText) {
                const charStream = CharStreams.fromString(currentLineText);
                const lexer = new CustomLangLexer(charStream) as CustomLangLexer;
                const commonTokenStream = new CommonTokenStream(lexer);
                commonTokenStream.fill(); // Quan trọng: Đảm bảo tất cả các token được đọc
                state.tokensForCurrentLine = commonTokenStream.tokens;
                state.currentTokenIndexOnLine = 0;
                state.currentLineTextCache = currentLineText;

                // console.log(`DEBUG: Lexed new line: "${currentLineText}". Tokens:`, state.tokensForCurrentLine.map((t: Token) => t.text + `(${t.type})`));
            }

            // Nếu stream đã đến cuối dòng, không còn gì để xử lý
            if (stream.eol()) {
                return null;
            }

            let currentToken: Token | null = null;
            while (state.currentTokenIndexOnLine < state.tokensForCurrentLine.length) {
            
                const token = state.tokensForCurrentLine[state.currentTokenIndexOnLine];
                const tokenStartOnLine = token.start;
                const tokenEndOnLine = token.stop + 1;
                // Nếu token ANTLR này bắt đầu sau vị trí hiện tại của stream
                if (tokenStartOnLine > currentStreamPos) {
                    // Đây là khoảng trắng hoặc ký tự không phải token ANTLR.
                    // Chúng ta phải di chuyển stream qua các ký tự này từng cái một.
                    const targetPos = tokenStartOnLine;
                    while (stream.pos < targetPos && !stream.eol()) {
                        stream.next();
                    }
                    
                    return null; // Trả về null cho khoảng trắng/không highlight
                }

                // Nếu token ANTLR này bao gồm vị trí hiện tại của stream
                if (tokenEndOnLine > currentStreamPos) {
                    currentToken = token;
                    break; // Đã tìm thấy token cần xử lý
                }

                // Nếu token ANTLR này đã nằm hoàn toàn phía sau vị trí stream hiện tại
                // (có nghĩa là stream đã tiến qua token này mà chưa được xử lý),
                // chúng ta bỏ qua token này và chuyển sang token tiếp theo.
                state.currentTokenIndexOnLine++;
            }
            
            // Nếu tìm thấy một token ANTLR phù hợp
            if (currentToken) {
                const tokenEndOnLine = currentToken.stop + 1;

                // Di chuyển stream qua token này từng ký tự một
                const targetPos = tokenEndOnLine;
                while (stream.pos < targetPos && !stream.eol()) {
                    stream.next();
                }

                state.currentTokenIndexOnLine++; // Chuyển sang token tiếp theo
                console.log(currentToken.type);

                // Ánh xạ loại token ANTLR sang tên lớp CSS của CodeMirror
                switch (currentToken.type) {
                    case CustomLangLexer.IF:
                    case CustomLangLexer.ELSE:
                    case CustomLangLexer.FOR:
                    case CustomLangLexer.WHILE:
                    case CustomLangLexer.DEF:
                    case CustomLangLexer.NOT:
                    case CustomLangLexer.AND:
                    case CustomLangLexer.OR:
                    case CustomLangLexer.IN:
                    case CustomLangLexer.IS:
                    case CustomLangLexer.TRUE:
                    case CustomLangLexer.FALSE:
                        return "keyword";
                    case CustomLangLexer.DECIMAL_INTEGER:
                    case CustomLangLexer.FLOAT_NUMBER:
                    case CustomLangLexer.OCT_INTEGER:
                    case CustomLangLexer.HEX_INTEGER:
                    case CustomLangLexer.BIN_INTEGER:
                        return "number";
                    case CustomLangLexer.STRING:
                        return "string";
                    case CustomLangLexer.COMMENT:
                        return "comment";
                    case CustomLangLexer.IDENTIFIER:
                        return "variable";
                    case CustomLangLexer.ADD:
                    case CustomLangLexer.MINUS:
                    case CustomLangLexer.STAR:
                    case CustomLangLexer.DIV:
                    case CustomLangLexer.ASSIGN:
                    case CustomLangLexer.DOT:
                        return "operator";
                    case CustomLangLexer.OPEN_BRACK:
                    case CustomLangLexer.CLOSE_BRACK:
                    case CustomLangLexer.COLON:
                    case CustomLangLexer.COMMA:
                    case CustomLangLexer.SEMI_COLON:
                        return "punctuation";
                    case CustomLangLexer.NEWLINE:
                        return null;
                    case CustomLangLexer.INDENT:
                    case CustomLangLexer.DEDENT:
                        return null;
                    default:
                        return null;
                }
            }

            // Nếu không tìm thấy token ANTLR nào phù hợp với vị trí hiện tại
            // (có thể do lỗi cú pháp, ký tự không xác định, hoặc khoảng trắng cuối dòng).
            // Chúng ta phải đảm bảo stream tiến lên.
            if (!stream.eol()) {
                stream.next(); // Tiêu thụ 1 ký tự để tiến stream
            }
            return null; // Không highlight ký tự này hoặc trả về class 'error'
        },

        indent: function(state: any, textAfter: string): number | typeof CodeMirror.Pass {
            return CodeMirror.Pass;
        },

        lineComment: "#",
        closeBrackets: "()[]{}", // Tự động đóng ngoặc
        fold: "indent" // Gấp mã theo thụt lề
    };
});

// Đăng ký MIME type để CodeMirror biết khi nào sử dụng mode này
CodeMirror.defineMIME("text/x-customlang", "customlang");

// Có thể xuất hàm này nếu bạn muốn khởi tạo CodeMirror Mode từ bên ngoài
// export function registerCustomLangMode() { /* ... */ }
  }
}

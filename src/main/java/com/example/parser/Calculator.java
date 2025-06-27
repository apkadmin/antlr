package com.example.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

public class Calculator {

    public static void main(String[] args) throws Exception {
        String sourceCode = """
                `Số nguyên` = 5
                `Số thực`  = 5.5
                `Ds mảng` = [1,2,3,4]
                Nếu `Số nguyên` == 5:
                    `Số nguyên`= 10
                Duyệt `Mảng` trong `Ds mảng`:
                    `So mang` = 21
                    `Số nguyên` = 1
                Lặp `So mang` < 11:
                    `Số nguyên` = `Số nguyên` + 1
                """;

        CharStream charStream = CharStreams.fromReader(new StringReader(sourceCode));
        CustomLangLexer lexer = new CustomLangLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CustomLangParser parser = new CustomLangParser(tokens);

        parser.setBuildParseTree(true);

        // Thêm ErrorListener để bắt lỗi từ Lexer và Parser
        parser.removeErrorListeners(); // Xóa listener mặc định
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Lỗi cú pháp tại dòng " + line + ":" + charPositionInLine + " - " + msg);
            }
        });

        try {
            ParseTree tree = parser.program();
            System.out.println("Parse Tree:\n" + tree.toStringTree(parser));

            if (tree == null) {
                System.err.println("Lỗi nghiêm trọng: Không thể tạo Parse Tree. Vui lòng kiểm tra lại cú pháp Python hoặc phiên bản Grammar/Parser.");
                return; // Dừng lại nếu tree là null
            }

            System.out.println("--- Parse Tree đã được tạo thành công ---");
            // System.out.println(tree.toStringTree(parser)); // Có thể in ra để kiểm tra

            // --- Sau đó mới thực thi Visitor ---
            CustomLangToJavaConverter executor = new CustomLangToJavaConverter();
            executor.visit(tree); // Bắt đầu thực thi từ node gốc của cây

            String javaCodeResult = executor.visit(tree); // Phương thức visit sẽ duyệt cây và tạo Java code


            System.out.println("\n--- Kết quả thực thi ---");
            System.out.println(javaCodeResult);
        } catch (Exception e) {
            System.err.println("Lỗi trong quá trình phân tích cú pháp: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
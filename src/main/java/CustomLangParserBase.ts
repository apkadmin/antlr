import { Parser, TokenStream } from "antlr4";

export default abstract class CustomLangParserBase extends Parser {

    constructor(input: TokenStream) {
        super(input);
    }

    CannotBePlusMinus() {
        return true;
    }   

    CannotBeDotLpEq() {
        return true;
    }   
}

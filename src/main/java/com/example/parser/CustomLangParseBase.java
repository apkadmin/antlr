package com.example.parser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class CustomLangParseBase extends Parser {
    protected CustomLangParseBase(TokenStream input)
    {
        super(input);
    }

    public boolean CannotBePlusMinus()
    {
        return true;
    }

    public boolean CannotBeDotLpEq()
    {
        return true;
    }
}

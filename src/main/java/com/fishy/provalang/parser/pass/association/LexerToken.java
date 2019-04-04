package com.fishy.provalang.parser.pass.association;

import com.fishy.provalang.api.lexer.LexToken;
import com.fishy.provalang.api.lexer.TokenType;
import com.fishy.provalang.api.parser.pass.PassToken;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.stream.Collectors;

@Data
@EqualsAndHashCode(callSuper = true)
public class LexerToken extends PassToken
{
    public final LexToken token;

    public final TokenType type;
    public final TokenType.TokenData data;

    public LexerToken(@NotNull LexToken token)
    {
        this.token = token;

        this.type = token.type;
        this.data = token.data;
    }

    public static List<LexerToken> convert(@NotNull List<LexToken> tokens)
    {
        return tokens.stream().map(LexerToken::new).collect(Collectors.toList());
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2019 Matt Provost                                                                 /
////////////////////////////////////////////////////////////////////////////////////////////////////

package com.fishy.plye.api.lexer.info;

import com.fishy.plye.api.lexer.LexToken;
import com.fishy.plye.api.lexer.LexTokenInfo;
import com.fishy.plye.api.lexer.TokenType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class NullTokenType implements TokenType
{
    public static final NullTokenType instance = new NullTokenType();

    @NotNull
    @Contract("_ -> new")
    public static LexToken create(LexTokenInfo info)
    {
        return new LexToken(instance, instance.cast(info, null));
    }

    @Override
    public TokenData cast(LexTokenInfo info, char[] buffer)
    {
        return new NullTokenData(info);
    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    public static class NullTokenData extends TokenData
    {
        public NullTokenData(LexTokenInfo info)
        {
            super(info);
        }
    }
}

package com.fishy.provalang.lexer.tokens;

import com.fishy.provalang.api.lexer.LexerTokenInfo;
import com.fishy.provalang.api.lexerNew.LexerApi;
import com.fishy.provalang.api.lexerNew.TokenType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

public class OpAssignOperator
{
    public static final Add      add      = new Add();
    public static final Subtract subtract = new Subtract();
    public static final Multiply multiply = new Multiply();
    public static final Divide   divide   = new Divide();

    public static final ShiftLeft  shiftLeft  = new ShiftLeft();
    public static final ShiftRight shiftRight = new ShiftRight();

    public static final And and = new And();
    public static final Or  or  = new Or();
    public static final Xor xor = new Xor();

    public static void addDefaultTypes()
    {
        addDefaultTypes(LexerApi.getTokens());
    }

    public static void addDefaultTypes(List<TokenType> list)
    {
        LexerApi.addTokenTypes(list, new TokenType[]{
                add, subtract, multiply, divide,
                shiftLeft, shiftRight,
                and, or, xor
        });
    }

    @Data
    public static class Add implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Add);
        }
    }

    @Data
    public static class Subtract implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Subtract);
        }
    }

    @Data
    public static class Multiply implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Multiply);
        }
    }

    @Data
    public static class Divide implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Divide);
        }
    }

    @Data
    public static class ShiftLeft implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.ShiftLeft);
        }
    }

    @Data
    public static class ShiftRight implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.ShiftRight);
        }
    }

    @Data
    public static class And implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.And);
        }
    }

    @Data
    public static class Or implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Or);
        }
    }

    @Data
    public static class Xor implements TokenType
    {
        @Override
        public TokenData cast(LexerTokenInfo info, char[] buffer)
        {
            return new OpAssignOperatorData(info, OperatorType.Xor);
        }
    }

    public enum OperatorType
    {
        Add,
        Subtract,
        Multiply,
        Divide,

        ShiftLeft,
        ShiftRight,

        And,
        Or,
        Xor
    }

    @EqualsAndHashCode(callSuper = false)
    @Data
    public static class OpAssignOperatorData extends TokenType.TokenData
    {
        public final OperatorType type;

        public OpAssignOperatorData(LexerTokenInfo info, OperatorType type)
        {
            super(info);

            this.type = type;
        }
    }
}
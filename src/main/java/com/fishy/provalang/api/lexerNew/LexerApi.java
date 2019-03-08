package com.fishy.provalang.api.lexerNew;

import com.fishy.provalang.api.lexerNew.match.Match;
import com.fishy.provalang.lexer.matchers.BinaryOperatorMatcher;
import com.fishy.provalang.lexer.tokens.*;

import java.util.ArrayList;
import java.util.List;

public class LexerApi
{
    // LIST STUFF

    private static final List<TokenType> tokenTypes = new ArrayList<>();
    private static final List<Match>     matches    = new ArrayList<>();

    public static void addTokenType(TokenType token)
    {
        addTokenType(tokenTypes, token);
    }

    public static void addTokenType(List<TokenType> list, TokenType token)
    {
        if (!list.contains(token))
            list.add(token);
    }

    public static void addTokenTypes(TokenType[] tokens)
    {
        addTokenTypes(tokenTypes, tokens);
    }

    public static void addTokenTypes(List<TokenType> list, TokenType[] tokens)
    {
        for (TokenType token : tokens)
            addTokenType(list, token);
    }

    public static void addMatch(Match match)
    {
        addMatch(getMatches(), match);
    }

    public static void addMatch(List<Match> list, Match match)
    {
        if(!list.contains(match))
            list.add(match);
    }

    public static void addMatches(Match[] matches)
    {
        addMatches(getMatches(), matches);
    }

    public static void addMatches(List<Match> list, Match[] matches)
    {
        for(Match match : matches)
            addMatch(list, match);
    }

    public static void addDefaultTokens()
    {
        addDefaultTokens(getTokens());
    }

    public static void addDefaultTokens(List<TokenType> tokens)
    {
        BinaryOperator.addDefaultTypes(tokens);
        Comment.addDefaultTypes(tokens);
        Identifier.addDefaultType(tokens);
        Ignored.addDefaultTypes(tokens);
        Keyword.addDefaultTypes(tokens);
        Literal.addDefaultTypes(tokens);
        OpAssignOperator.addDefaultTypes(tokens);
        Separator.addDefaultTypes(tokens);
        UnaryOperator.addDefaultTypes(tokens);
    }

    public static void addDefaultMatches()
    {
        addDefaultMatches(getMatches());
    }

    public static void addDefaultMatches(List<Match> match)
    {
        BinaryOperatorMatcher.addDefaultMatches(match);
    }

    public static List<TokenType> getTokens()
    {
        return tokenTypes;
    }

    public static List<Match> getMatches()
    {
        return matches;
    }

    // TOKEN STUFF
}

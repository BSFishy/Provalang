package com.fishy.provalang.api.parser;

import com.fishy.provalang.api.file.Program;

public interface IParser
{
    void parse(Program p); // TODO: work with lexer stream not list
}
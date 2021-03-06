////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2019 Matt Provost                                                                 /
////////////////////////////////////////////////////////////////////////////////////////////////////

package com.fishy.plye.api.data.parser;

import lombok.Data;

import java.util.List;

@Data
public class PassResult<T>
{
    public final boolean full;
    public final List<T> tokens;
    public final int     length;
}

package com.juancnuno.adventofcode2022.day11;

record Squaring() implements Operation {
    @Override
    public int apply(int factor) {
        return factor * factor;
    }
}

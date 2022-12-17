package com.juancnuno.adventofcode2022.day11;

record Multiplication(int factor) implements Operation {
    @Override
    public int apply(int factor) {
        return factor * this.factor;
    }
}

package com.juancnuno.adventofcode2022.day11;

record Addition(int addend) implements Operation {
    @Override
    public int apply(int addend) {
        return addend + this.addend;
    }
}

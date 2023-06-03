package com.juancnuno.adventofcode2022.day03;

public record Item(char value) {
    public int priority() {
        return Character.isLowerCase(value) ? value - 'a' + 1 : value - 'A' + 27;
    }
}

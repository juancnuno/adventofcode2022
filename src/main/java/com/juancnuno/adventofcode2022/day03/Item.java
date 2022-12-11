package com.juancnuno.adventofcode2022.day03;

record Item(char value) {
    int priority() {
        return Character.isLowerCase(value) ? value - 'a' + 1 : value - 'A' + 27;
    }
}

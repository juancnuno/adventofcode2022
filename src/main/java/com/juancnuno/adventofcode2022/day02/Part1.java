package com.juancnuno.adventofcode2022.day02;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

final class Part1 {
    private final Stream<String> lines;

    Part1(Stream<String> lines) {
        this.lines = lines;
    }

    int getTotalScore() {
        return lines
                .map(Round::new)
                .mapToInt(Round::getScore)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResult(lines -> new Part1(lines).getTotalScore());
    }
}

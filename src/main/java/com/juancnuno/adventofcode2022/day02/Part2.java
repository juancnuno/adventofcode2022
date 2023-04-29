package com.juancnuno.adventofcode2022.day02;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

final class Part2 {
    private final Stream<String> lines;

    Part2(Stream<String> lines) {
        this.lines = lines;
    }

    int getTotalScore() {
        return lines
                .map(Round2::new)
                .mapToInt(Round2::getScore)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> new Part2(lines).getTotalScore());
    }
}

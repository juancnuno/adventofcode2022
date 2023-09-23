package com.juancnuno.adventofcode2022.day02;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

public final class Part1 {
    private final Stream<String> lines;

    public Part1(Stream<String> lines) {
        this.lines = lines;
    }

    public int getTotalScore() {
        return lines
                .map(Round::new)
                .mapToInt(Round::getScore)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> new Part1(lines).getTotalScore());
    }
}

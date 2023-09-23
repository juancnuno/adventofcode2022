package com.juancnuno.adventofcode2022.day02;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

public final class Part2 {
    private final Stream<String> lines;

    public Part2(Stream<String> lines) {
        this.lines = lines;
    }

    public int getTotalScore() {
        return lines
                .map(Round2::new)
                .mapToInt(Round2::getScore)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> new Part2(lines).getTotalScore());
    }
}

package com.juancnuno.adventofcode2022.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part1(lines).getTotalScore());
        }
    }
}

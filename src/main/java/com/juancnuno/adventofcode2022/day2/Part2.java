package com.juancnuno.adventofcode2022.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part2(lines).getTotalScore());
        }
    }
}

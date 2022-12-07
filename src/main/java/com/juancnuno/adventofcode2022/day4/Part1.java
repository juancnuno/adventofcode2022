package com.juancnuno.adventofcode2022.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

final class Part1 {
    private final Stream<String> pairs;

    Part1(Stream<String> pairs) {
        this.pairs = pairs;
    }

    int getCount() {
        return (int) pairs
                .map(RangePair::new)
                .filter(RangePair::oneRangeContainsOther)
                .count();
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part1(lines).getCount());
        }
    }
}

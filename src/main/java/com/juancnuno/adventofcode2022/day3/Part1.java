package com.juancnuno.adventofcode2022.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

final class Part1 {
    private final Stream<String> items;

    Part1(Stream<String> items) {
        this.items = items;
    }

    int getSumOfPriorities() {
        return items
                .map(Rucksack::new)
                .map(Rucksack::getItemInBothCompartments)
                .mapToInt(Item::priority)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part1(lines).getSumOfPriorities());
        }
    }
}

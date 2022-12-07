package com.juancnuno.adventofcode2022.day3;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.stream.Stream;

final class Part2 {
    private final Stream<String> items;

    Part2(Stream<String> items) {
        this.items = items;
    }

    int getSumOfPriorities() {
        return Lists.partition(items.toList(), 3).stream()
                .map(Collection::stream)
                .map(Group::new)
                .map(Group::getItemInAllRucksacks)
                .mapToInt(Item::priority)
                .sum();
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part2(lines).getSumOfPriorities());
        }
    }
}

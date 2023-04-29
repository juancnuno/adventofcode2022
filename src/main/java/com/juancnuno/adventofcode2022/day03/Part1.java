package com.juancnuno.adventofcode2022.day03;

import com.juancnuno.adventofcode2022.AdventOfCode;

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

    public static void main(String[] args) {
        AdventOfCode.printResult(lines -> new Part1(lines).getSumOfPriorities());
    }
}

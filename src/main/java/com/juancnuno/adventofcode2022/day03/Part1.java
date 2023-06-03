package com.juancnuno.adventofcode2022.day03;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

public final class Part1 {
    private final Stream<String> items;

    public Part1(Stream<String> items) {
        this.items = items;
    }

    public int getSumOfPriorities() {
        return items
                .map(Rucksack::new)
                .map(Rucksack::getItemInBothCompartments)
                .mapToInt(Item::priority)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(items -> new Part1(items).getSumOfPriorities());
    }
}

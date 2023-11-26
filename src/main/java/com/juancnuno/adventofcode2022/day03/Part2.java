package com.juancnuno.adventofcode2022.day03;

import com.google.common.collect.Lists;
import com.juancnuno.adventofcode.AdventOfCode;

import java.util.Collection;
import java.util.stream.Stream;

public final class Part2 {
    private final Stream<String> items;

    public Part2(Stream<String> items) {
        this.items = items;
    }

    public int getSumOfPriorities() {
        return Lists.partition(items.toList(), 3).stream()
                .map(Collection::stream)
                .map(Group::new)
                .map(Group::getItemInAllRucksacks)
                .mapToInt(Item::priority)
                .sum();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(items -> new Part2(items).getSumOfPriorities());
    }
}

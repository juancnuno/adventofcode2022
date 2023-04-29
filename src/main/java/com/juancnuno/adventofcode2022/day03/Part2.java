package com.juancnuno.adventofcode2022.day03;

import com.google.common.collect.Lists;
import com.juancnuno.adventofcode2022.AdventOfCode;

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

    public static void main(String[] args) {
        AdventOfCode.printResult(items -> new Part2(items).getSumOfPriorities());
    }
}

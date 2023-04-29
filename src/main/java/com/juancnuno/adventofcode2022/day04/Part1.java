package com.juancnuno.adventofcode2022.day04;

import com.juancnuno.adventofcode2022.AdventOfCode;

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

    public static void main(String[] args) {
        AdventOfCode.printResultStream(pairs -> new Part1(pairs).getCount());
    }
}

package com.juancnuno.adventofcode2022.day04;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

final class Part2 {
    private final Stream<String> pairs;

    Part2(Stream<String> pairs) {
        this.pairs = pairs;
    }

    int getCount() {
        return (int) pairs
                .map(RangePair::new)
                .filter(pair -> pair.getRange1().overlaps(pair.getRange2()))
                .count();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(pairs -> new Part2(pairs).getCount());
    }
}

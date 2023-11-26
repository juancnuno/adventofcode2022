package com.juancnuno.adventofcode2022.day04;

import com.juancnuno.adventofcode.AdventOfCode;

import java.util.stream.Stream;

public final class Part2 {
    private final Stream<String> pairs;

    public Part2(Stream<String> pairs) {
        this.pairs = pairs;
    }

    public int getCount() {
        return (int) pairs
                .map(RangePair::new)
                .filter(pair -> pair.getRange1().overlaps(pair.getRange2()))
                .count();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(pairs -> new Part2(pairs).getCount());
    }
}

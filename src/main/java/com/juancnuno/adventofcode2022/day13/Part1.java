package com.juancnuno.adventofcode2022.day13;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public final class Part1 {
    private final String pairs;

    public Part1(String pairs) {
        this.pairs = pairs;
    }

    public int getSum() {
        var pairs = this.pairs.split("(?m)^\n");

        return IntStream.range(0, pairs.length)
                .filter(i -> isInRightOrder(pairs[i]))
                .map(i -> i + 1)
                .sum();
    }

    private static boolean isInRightOrder(String string) {
        var list = Arrays.stream(string.split("\n"))
                .map(Element::parse)
                .toList();

        return list.get(0).compareTo(list.get(1)) < 0;
    }

    public static void main(String[] args) {
        AdventOfCode.printResultString(pairs -> new Part1(pairs).getSum());
    }
}

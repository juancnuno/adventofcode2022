package com.juancnuno.adventofcode2022.day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;

final class Part1 {
    private final String pairs;

    Part1(String pairs) {
        this.pairs = pairs;
    }

    int getSum() {
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

    public static void main(String[] args) throws IOException {
        System.out.println(new Part1(Files.readString(Path.of(args[0]))).getSum());
    }
}

package com.juancnuno.adventofcode2022.day01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

final class Part2 {
    private int currentCalorieCount;
    private final List<Integer> calorieCounts;

    Part2(Stream<String> lines) {
        calorieCounts = new ArrayList<>();

        lines.forEach(this::handleLine);
        addCurrentCalorieCount();
    }

    private void handleLine(String line) {
        if (line.isEmpty()) {
            addCurrentCalorieCount();
        } else {
            currentCalorieCount += Integer.parseInt(line);
        }
    }

    private void addCurrentCalorieCount() {
        calorieCounts.add(currentCalorieCount);
        currentCalorieCount = 0;
    }

    int getSumOfThreeHighestCalorieCounts() {
        calorieCounts.sort(Comparator.reverseOrder());

        var i = calorieCounts.iterator();
        return i.next() + i.next() + i.next();
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part2(lines).getSumOfThreeHighestCalorieCounts());
        }
    }
}

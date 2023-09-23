package com.juancnuno.adventofcode2022.day01;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public final class Part2 {
    private int currentCalorieCount;
    private final List<Integer> calorieCounts;

    public Part2(Stream<String> lines) {
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

    public int getSumOfThreeHighestCalorieCounts() {
        calorieCounts.sort(Comparator.reverseOrder());

        var i = calorieCounts.iterator();
        return i.next() + i.next() + i.next();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> new Part2(lines).getSumOfThreeHighestCalorieCounts());
    }
}

package com.juancnuno.adventofcode2022.day01;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.stream.Stream;

final class Part1 {
    private int currentCalorieCount;
    private int maxCalorieCount;

    Part1(Stream<String> lines) {
        lines.forEach(this::handleLine);
        setMaxIfMaxIsLessThanCurrent();
    }

    private void handleLine(String line) {
        if (line.isEmpty()) {
            setMaxIfMaxIsLessThanCurrent();
        } else {
            currentCalorieCount += Integer.parseInt(line);
        }
    }

    private void setMaxIfMaxIsLessThanCurrent() {
        if (maxCalorieCount < currentCalorieCount) {
            maxCalorieCount = currentCalorieCount;
        }

        currentCalorieCount = 0;
    }

    int getMexCalorieCount() {
        return maxCalorieCount;
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> new Part1(lines).getMexCalorieCount());
    }
}

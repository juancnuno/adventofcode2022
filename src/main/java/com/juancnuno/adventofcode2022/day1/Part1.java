package com.juancnuno.adventofcode2022.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part1(lines).getMexCalorieCount());
        }
    }
}

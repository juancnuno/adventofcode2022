package com.juancnuno.adventofcode2022.day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

final class KeepAway {
    private final List<Monkey> monkeys;

    KeepAway(String monkeys) {
        this.monkeys = Arrays.stream(monkeys.split("(?m)^\n"))
                .map(Monkey::parseMonkey)
                .toList();
    }

    int getLevelOfMonkeyBusiness() {
        IntStream.range(0, 20).forEach(i -> playRound());

        var level = monkeys.stream()
                .map(Monkey::getInspectionCount)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Number::intValue)
                .limit(2)
                .reduce((count1, count2) -> count1 * count2);

        return level.orElseThrow();
    }

    private void playRound() {
        monkeys.stream().forEach(monkey -> monkey.takeTurn(monkeys));
    }
}

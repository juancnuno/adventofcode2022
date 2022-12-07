package com.juancnuno.adventofcode2022.day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

final class Step {
    private static final Pattern PATTERN = Pattern.compile("move (\\d+) from (\\d) to (\\d)");

    private final int crateCount;
    private final int fromStackIndex;
    private final int toStackIndex;

    Step(String string) {
        Matcher matcher = PATTERN.matcher(string);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(string);
        }

        crateCount = Integer.parseInt(matcher.group(1));
        fromStackIndex = Integer.parseInt(matcher.group(2)) - 1;
        toStackIndex = Integer.parseInt(matcher.group(3)) - 1;
    }

    void moveCrates(Stacks stacks) {
        IntStream.range(0, crateCount).forEach(index -> stacks.move(fromStackIndex, toStackIndex));
    }

    int getCrateCount() {
        return crateCount;
    }

    int getFromStackIndex() {
        return fromStackIndex;
    }

    int getToStackIndex() {
        return toStackIndex;
    }
}

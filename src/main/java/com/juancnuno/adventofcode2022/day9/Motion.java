package com.juancnuno.adventofcode2022.day9;

import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

final class Motion {
    private static final Pattern PATTERN = Pattern.compile("(\\w) (\\d+)");

    private final int stepCount;
    private final BiConsumer<Head, Knot> drag;

    private Motion(int stepCount, BiConsumer<Head, Knot> drag) {
        this.stepCount = stepCount;
        this.drag = drag;
    }

    static Motion parse(CharSequence motion) {
        var matcher = PATTERN.matcher(motion);

        if (!matcher.matches()) {
            throw new AssertionError(motion);
        }

        var type = matcher.group(1).charAt(0);

        return switch (type) {
            case 'U' -> new Motion(Integer.parseInt(matcher.group(2)), Head::dragUp);
            case 'D' -> new Motion(Integer.parseInt(matcher.group(2)), Head::dragDown);
            case 'L' -> new Motion(Integer.parseInt(matcher.group(2)), Head::dragLeft);
            case 'R' -> new Motion(Integer.parseInt(matcher.group(2)), Head::dragRight);
            default -> throw new AssertionError(type);
        };
    }

    void move(Head head, Knot tail, Collection<Position> positions) {
        IntStream.range(0, stepCount).forEach(stepIndex -> {
            drag.accept(head, tail);
            positions.add(tail.position);
        });
    }
}

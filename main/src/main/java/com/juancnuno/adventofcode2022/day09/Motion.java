package com.juancnuno.adventofcode2022.day09;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

final class Motion {
    private static final Pattern PATTERN = Pattern.compile("(\\w) (\\d+)");

    private final int stepCount;
    private final Consumer<Rope> drag;

    private Motion(int stepCount, Consumer<Rope> drag) {
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
            case 'U' -> new Motion(Integer.parseInt(matcher.group(2)), Rope::dragUp);
            case 'D' -> new Motion(Integer.parseInt(matcher.group(2)), Rope::dragDown);
            case 'L' -> new Motion(Integer.parseInt(matcher.group(2)), Rope::dragLeft);
            case 'R' -> new Motion(Integer.parseInt(matcher.group(2)), Rope::dragRight);
            default -> throw new AssertionError(type);
        };
    }

    void move(Rope rope, Collection<Position> positions) {
        IntStream.range(0, stepCount).forEach(stepIndex -> {
            drag.accept(rope);
            positions.add(rope.getTail().getPosition());
        });
    }
}

package com.juancnuno.adventofcode2022.day04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Range {
    private static final Pattern PATTERN = Pattern.compile("(\\d+)-(\\d+)");

    private final int min;
    private final int max;

    public Range(String range) {
        Matcher matcher = PATTERN.matcher(range);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(range);
        }

        min = Integer.parseInt(matcher.group(1));
        max = Integer.parseInt(matcher.group(2));
    }

    public boolean contains(Range range) {
        return min <= range.min && range.max <= max;
    }

    public boolean overlaps(Range range) {
        if (max < range.min) {
            return false;
        }

        // noinspection RedundantIfStatement
        if (range.max < min) {
            return false;
        }

        return true;
    }
}

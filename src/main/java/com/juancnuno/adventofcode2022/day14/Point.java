package com.juancnuno.adventofcode2022.day14;

import java.util.regex.Pattern;

record Point(int x, int y) {
    private static final Pattern PATTERN = Pattern.compile("(\\d+),(\\d+)");

    static Point parse(String point) {
        var matcher = PATTERN.matcher(point);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(point);
        }

        return new Point(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
    }
}

package adventofcode2022.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

final class Range {
    private static final Pattern PATTERN = Pattern.compile("(\\d+)-(\\d+)");

    private final int min;
    private final int max;

    Range(String range) {
        Matcher matcher = PATTERN.matcher(range);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(range);
        }

        min = Integer.parseInt(matcher.group(1));
        max = Integer.parseInt(matcher.group(2));
    }

    boolean contains(Range range) {
        return min <= range.min && range.max <= max;
    }

    private boolean contains(int section) {
        return min <= section && section <= max;
    }

    boolean overlaps(Range range) {
        return IntStream.rangeClosed(min, max).anyMatch(range::contains);
    }
}

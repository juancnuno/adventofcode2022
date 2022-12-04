package adventofcode2022.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class RangePair {
    private static final Pattern PATTERN = Pattern.compile("(\\d+-\\d+),(\\d+-\\d+)");

    private final Range range1;
    private final Range range2;

    RangePair(String pair) {
        Matcher matcher = PATTERN.matcher(pair);

        if (!matcher.matches()) {
            throw new IllegalArgumentException(pair);
        }

        range1 = new Range(matcher.group(1));
        range2 = new Range(matcher.group(2));
    }

    boolean oneRangeContainsOther() {
        return range1.contains(range2) || range2.contains(range1);
    }

    Range getRange1() {
        return range1;
    }

    Range getRange2() {
        return range2;
    }
}

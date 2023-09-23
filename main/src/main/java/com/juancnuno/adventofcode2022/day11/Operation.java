package com.juancnuno.adventofcode2022.day11;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

interface Operation {
    Pattern PATTERN = Pattern.compile("new = old (.) (\\w+)");

    static Operation parseOperation(CharSequence sequence) {
        var matcher = PATTERN.matcher(sequence);

        if (!matcher.matches()) {
            throw new AssertionError(sequence);
        }

        var operator = matcher.group(1).charAt(0);

        return switch (operator) {
            case '+' -> new Addition(Integer.parseInt(matcher.group(2)));
            case '*' -> parseMultiplication(matcher);
            default -> throw new AssertionError(operator);
        };
    }

    private static Operation parseMultiplication(MatchResult result) {
        var factor = result.group(2);

        if (factor.equals("old")) {
            return new Squaring();
        }

        return new Multiplication(Integer.parseInt(factor));
    }

    int apply(int operand);
}

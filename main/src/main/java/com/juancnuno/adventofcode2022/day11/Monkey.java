package com.juancnuno.adventofcode2022.day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class Monkey {
    private static final Pattern PATTERN = Pattern.compile("""
            Monkey (\\d):
              Starting items: (.+)
              Operation: (.+)
              Test: divisible by (\\d+)
                If true: throw to monkey (\\d)
                If false: throw to monkey (\\d)
            """);

    private final int id;
    private final List<Integer> startingItems;
    private final Operation operation;
    private final IntPredicate predicate;
    private final int idToThrowToIfPredicateMatches;
    private final int idToThrowToIfPredicateDoesntMatch;

    private int inspectionCount;

    private Monkey(Builder builder) {
        id = builder.id;
        startingItems = builder.startingItems;
        operation = builder.operation;
        predicate = builder.predicate;
        idToThrowToIfPredicateMatches = builder.idToThrowToIfPredicateMatches;
        idToThrowToIfPredicateDoesntMatch = builder.idToThrowToIfPredicateDoesntMatch;
    }

    public static Monkey parseMonkey(String string) {
        var matcher = PATTERN.matcher(string);

        if (!matcher.matches()) {
            throw new AssertionError(string);
        }

        return new Builder()
                .setId(Integer.parseInt(matcher.group(1)))
                .setStartingItems(parseStartingItems(matcher.group(2)))
                .setOperation(Operation.parseOperation(matcher.group(3)))
                .setPredicate(new IsDivisibleBy(Integer.parseInt(matcher.group(4))))
                .setIdToThrowToIfPredicateMatches(Integer.parseInt(matcher.group(5)))
                .setIdToThrowToIfPredicateDoesntMatch(Integer.parseInt(matcher.group(6)))
                .build();
    }

    private static List<Integer> parseStartingItems(String string) {
        return Arrays.stream(string.split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static final class Builder {
        private int id;
        private List<Integer> startingItems;
        private Operation operation;
        private IntPredicate predicate;
        private int idToThrowToIfPredicateMatches;
        private int idToThrowToIfPredicateDoesntMatch;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setStartingItems(List<Integer> startingItems) {
            this.startingItems = startingItems;
            return this;
        }

        public Builder setOperation(Operation operation) {
            this.operation = operation;
            return this;
        }

        public Builder setPredicate(IntPredicate predicate) {
            this.predicate = predicate;
            return this;
        }

        public Builder setIdToThrowToIfPredicateMatches(int idToThrowToIfPredicateMatches) {
            this.idToThrowToIfPredicateMatches = idToThrowToIfPredicateMatches;
            return this;
        }

        public Builder setIdToThrowToIfPredicateDoesntMatch(int idToThrowToIfPredicateDoesntMatch) {
            this.idToThrowToIfPredicateDoesntMatch = idToThrowToIfPredicateDoesntMatch;
            return this;
        }

        public Monkey build() {
            return new Monkey(this);
        }
    }

    void takeTurn(List<Monkey> monkeys) {
        while (!startingItems.isEmpty()) {
            var item = startingItems.remove(0);
            item = operation.apply(item);
            item /= 3;

            var id = predicate.test(item) ? idToThrowToIfPredicateMatches : idToThrowToIfPredicateDoesntMatch;
            monkeys.get(id).startingItems.add(item);

            inspectionCount++;
        }
    }

    int getInspectionCount() {
        return inspectionCount;
    }

    @Override
    public int hashCode() {
        int hashCode = id;

        hashCode = 31 * hashCode + startingItems.hashCode();
        hashCode = 31 * hashCode + operation.hashCode();
        hashCode = 31 * hashCode + predicate.hashCode();
        hashCode = 31 * hashCode + idToThrowToIfPredicateMatches;
        hashCode = 31 * hashCode + idToThrowToIfPredicateDoesntMatch;
        hashCode = 31 * hashCode + inspectionCount;

        return hashCode;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Monkey monkey)) {
            return false;
        }

        return id == monkey.id
                && startingItems.equals(monkey.startingItems)
                && operation.equals(monkey.operation)
                && predicate.equals(monkey.predicate)
                && idToThrowToIfPredicateMatches == monkey.idToThrowToIfPredicateMatches
                && idToThrowToIfPredicateDoesntMatch == monkey.idToThrowToIfPredicateDoesntMatch
                && inspectionCount == monkey.inspectionCount;
    }
}

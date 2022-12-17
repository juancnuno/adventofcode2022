package com.juancnuno.adventofcode2022.day11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

final class MonkeyTest {
    private MonkeyTest() {
    }

    @Test
    void parseMonkey() {
        // Arrange
        var string = """
                Monkey 0:
                  Starting items: 79, 98
                  Operation: new = old * 19
                  Test: divisible by 23
                    If true: throw to monkey 2
                    If false: throw to monkey 3
                """;

        // Act
        var actual = Monkey.parseMonkey(string);

        // Assert
        var expected = new Monkey.Builder()
                .setId(0)
                .setStartingItems(List.of(79, 98))
                .setOperation(new Multiplication(19))
                .setPredicate(new IsDivisibleBy(23))
                .setIdToThrowToIfPredicateMatches(2)
                .setIdToThrowToIfPredicateDoesntMatch(3)
                .build();

        assertEquals(expected, actual);
    }
}

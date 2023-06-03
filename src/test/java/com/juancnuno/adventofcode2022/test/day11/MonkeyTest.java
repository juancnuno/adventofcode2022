package com.juancnuno.adventofcode2022.test.day11;

import com.juancnuno.adventofcode2022.day11.IsDivisibleBy;
import com.juancnuno.adventofcode2022.day11.Monkey;
import com.juancnuno.adventofcode2022.day11.Multiplication;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class MonkeyTest {
    @Test
    public void parseMonkey() {
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

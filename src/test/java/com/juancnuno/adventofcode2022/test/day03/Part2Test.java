package com.juancnuno.adventofcode2022.test.day03;

import com.juancnuno.adventofcode2022.day03.Part2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part2Test {
    @Test
    public void getSumOfPriorities() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var part2 = new Part2("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """.lines());

        // Act
        var sum = part2.getSumOfPriorities();

        // Assert
        assertEquals(70, sum);
    }
}

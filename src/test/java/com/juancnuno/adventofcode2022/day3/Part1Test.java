package com.juancnuno.adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part1Test {
    private Part1Test() {
    }

    @Test
    void getSumOfPriorities() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var part1 = new Part1("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """.lines());

        // Act
        var sum = part1.getSumOfPriorities();

        // Assert
        assertEquals(157, sum);
    }
}

package com.juancnuno.adventofcode2022.day03.test;

import com.juancnuno.adventofcode2022.day03.Part1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part1Test {
    @Test
    public void getSumOfPriorities() {
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

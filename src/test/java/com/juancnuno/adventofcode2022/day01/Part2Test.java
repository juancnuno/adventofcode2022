package com.juancnuno.adventofcode2022.day01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class Part2Test {
    @Test
    void getSumOfThreeHighestCalorieCounts() {
        // Arrange
        var part2 = new Part2("""
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                10000
                """.lines());

        // Act
        var sum = part2.getSumOfThreeHighestCalorieCounts();

        // Assert
        assertEquals(45_000, sum);
    }
}

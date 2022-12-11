package com.juancnuno.adventofcode2022.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class Part1Test {
    private Part1Test() {
    }

    @Test
    void getCount() {
        // Arrange
        var part1 = new Part1("""
                2-4,6-8
                2-3,4-5
                5-7,7-9
                2-8,3-7
                6-6,4-6
                2-6,4-8
                """.lines());

        // Act
        var count = part1.getCount();

        // Assert
        assertEquals(2, count);
    }
}

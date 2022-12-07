package com.juancnuno.adventofcode2022.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part2Test {
    private Part2Test() {
    }

    @Test
    void getCount() {
        // Arrange
        var part2 = new Part2("""
                2-4,6-8
                2-3,4-5
                5-7,7-9
                2-8,3-7
                6-6,4-6
                2-6,4-8
                """.lines());

        // Act
        var count = part2.getCount();

        // Assert
        assertEquals(4, count);
    }
}

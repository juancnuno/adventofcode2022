package com.juancnuno.adventofcode2022.day01.test;

import com.juancnuno.adventofcode2022.day01.Part1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part1Test {
    @Test
    public void getMexCalorieCount() {
        // Arrange
        var part1 = new Part1("""
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
        var count = part1.getMexCalorieCount();

        // Assert
        assertEquals(24_000, count);
    }
}

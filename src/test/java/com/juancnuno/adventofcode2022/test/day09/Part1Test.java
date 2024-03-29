package com.juancnuno.adventofcode2022.test.day09;

import com.juancnuno.adventofcode2022.day09.Part1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part1Test {
    @Test
    public void getPositionCount() {
        // Arrange
        var input = """
                R 4
                U 4
                L 3
                D 1
                R 4
                D 1
                L 5
                R 2
                """;

        var part1 = new Part1(input.lines());

        // Act
        var count = part1.getPositionCount();

        // Assert
        assertEquals(13, count);
    }
}

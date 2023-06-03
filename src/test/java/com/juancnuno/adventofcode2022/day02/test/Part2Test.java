package com.juancnuno.adventofcode2022.day02.test;

import com.juancnuno.adventofcode2022.day02.Part2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part2Test {
    private Part2Test() {
    }

    @Test
    void getTotalScore() {
        // Arrange
        var part2 = new Part2("""
                A Y
                B X
                C Z
                """.lines());

        // Act
        var score = part2.getTotalScore();

        // Assert
        assertEquals(12, score);
    }
}

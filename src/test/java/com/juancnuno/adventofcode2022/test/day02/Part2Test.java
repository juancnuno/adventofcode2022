package com.juancnuno.adventofcode2022.test.day02;

import com.juancnuno.adventofcode2022.day02.Part2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part2Test {
    @Test
    public void getTotalScore() {
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

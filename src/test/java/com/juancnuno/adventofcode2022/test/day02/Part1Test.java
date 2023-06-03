package com.juancnuno.adventofcode2022.test.day02;

import com.juancnuno.adventofcode2022.day02.Part1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part1Test {
    @Test
    public void getTotalScore() {
        // Arrange
        var part1 = new Part1("""
                A Y
                B X
                C Z""".lines());

        // Act
        var score = part1.getTotalScore();

        // Assert
        assertEquals(15, score);
    }
}

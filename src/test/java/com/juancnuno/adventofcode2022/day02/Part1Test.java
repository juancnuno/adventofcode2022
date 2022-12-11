package com.juancnuno.adventofcode2022.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class Part1Test {
    private Part1Test() {
    }

    @Test
    void getTotalScore() {
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

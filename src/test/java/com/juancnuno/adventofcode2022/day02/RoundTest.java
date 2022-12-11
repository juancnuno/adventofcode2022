package com.juancnuno.adventofcode2022.day02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class RoundTest {
    private RoundTest() {
    }

    @Test
    void round() {
        // Act
        var round = new Round("A Y");

        // Assert
        assertEquals(OpponentsPlay.A, round.getOpponentsPlay());
        assertEquals(YourPlay.Y, round.getYourPlay());
    }
}

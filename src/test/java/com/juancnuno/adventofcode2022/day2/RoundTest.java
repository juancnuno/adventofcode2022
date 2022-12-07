package com.juancnuno.adventofcode2022.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

package com.juancnuno.adventofcode2022.day02.test;

import com.juancnuno.adventofcode2022.day02.OpponentsPlay;
import com.juancnuno.adventofcode2022.day02.Round;
import com.juancnuno.adventofcode2022.day02.YourPlay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class RoundTest {
    @Test
    public void round() {
        // Act
        var round = new Round("A Y");

        // Assert
        assertEquals(OpponentsPlay.A, round.getOpponentsPlay());
        assertEquals(YourPlay.Y, round.getYourPlay());
    }
}

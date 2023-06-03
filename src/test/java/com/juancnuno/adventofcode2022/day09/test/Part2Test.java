package com.juancnuno.adventofcode2022.day09.test;

import com.juancnuno.adventofcode2022.day09.Part2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class Part2Test {
    @Test
    public void getPositionCount1() {
        // Arrange
        var input = """
                R 4
                """;

        var part2 = new Part2(input.lines());

        // Act
        part2.getPositionCount();

        // Assert
        var expected = """
                4321H
                """;

        assertEquals(expected, part2.rope.toString());
    }

    @Test
    public void getPositionCount2() {
        // Arrange
        var input = """
                R 4
                U 1
                """;

        var part2 = new Part2(input.lines());

        // Act
        part2.getPositionCount();

        // Assert
        var expected = """
                ....H
                4321.
                """;

        assertEquals(expected, part2.rope.toString());
    }

    @Test
    public void getPositionCount3() {
        // Arrange
        var input = """
                R 4
                U 2
                """;

        var part2 = new Part2(input.lines());

        // Act
        part2.getPositionCount();

        // Assert
        var expected = """
                ....H
                .4321
                5....
                """;

        assertEquals(expected, part2.rope.toString());
    }

    @Test
    public void getPositionCount4() {
        // Arrange
        var input = """
                R 5
                U 8
                """;

        var part2 = new Part2(input.lines());

        // Act
        part2.getPositionCount();

        // Assert
        var expected = """
                .....H
                .....1
                .....2
                .....3
                ....54
                ...6..
                ..7...
                .8....
                9.....
                """;

        assertEquals(expected, part2.rope.toString());
    }
}

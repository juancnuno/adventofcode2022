package com.juancnuno.adventofcode2022.test.day08;

import com.juancnuno.adventofcode2022.day08.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GridTest {
    private static final String STRING = """
            30373
            25512
            65332
            33549
            35390
            """;

    private final Grid grid = new Grid(STRING.lines().toList());

    @Test
    public void getVisibleTreeCount() {
        // Act
        var count = grid.getVisibleTreeCount();

        // Assert
        assertEquals(21, count);
    }

    @Test
    public void getScenicScore1() {
        // Arrange
        var tree = grid.getRows().get(1).get(2);

        // Act
        var score = tree.getScenicScore();

        // Assert
        assertEquals(4, score);
    }

    @Test
    public void getScenicScore2() {
        // Arrange
        var tree = grid.getRows().get(3).get(2);

        // Act
        var score = tree.getScenicScore();

        // Assert
        assertEquals(8, score);
    }

    @Test
    public void getMaxScenicScore() {
        // Act
        var score = grid.getMaxScenicScore();

        // Assert
        assertEquals(8, score);
    }
}

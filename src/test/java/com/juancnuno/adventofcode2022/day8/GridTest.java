package com.juancnuno.adventofcode2022.day8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class GridTest {
    private GridTest() {
    }

    @Test
    void getVisibleTreeCount() {
        // Arrange
        var string = """
                30373
                25512
                65332
                33549
                35390
                """;

        var grid = new Grid(string.lines().toList());

        // Act
        var count = grid.getVisibleTreeCount();

        // Assert
        assertEquals(21, count);
    }
}

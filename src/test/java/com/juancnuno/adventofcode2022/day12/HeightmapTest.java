package com.juancnuno.adventofcode2022.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class HeightmapTest {
    private HeightmapTest() {
    }

    @Test
    void getMinStepCountFromStartToEnd() {
        // Arrange
        var input = """
                Sabqponm
                abcryxxl
                accszExk
                acctuvwj
                abdefghi
                """;

        var heightmap = new Heightmap(input.lines().toList());

        // Act
        var count = heightmap.getMinStepCountFromStartToEnd();

        // Assert
        assertEquals(31, count);
    }
}

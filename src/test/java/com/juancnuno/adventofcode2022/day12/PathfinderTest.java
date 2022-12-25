package com.juancnuno.adventofcode2022.day12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.OptionalInt;

import org.junit.jupiter.api.Test;

final class PathfinderTest {
    private PathfinderTest() {
    }

    @Test
    void getMinStepCountFromStartToEnd1() {
        // Arrange
        var input = """
                Sabqponm
                abcryxxl
                accszExk
                acctuvwj
                abdefghi
                """;

        var pathfinder = new Pathfinder(new Heightmap(input.lines().toList()));

        // Act
        var count = pathfinder.getMinStepCountFromStartToEnd();

        // Assert
        assertEquals(31, count);
    }

    @Test
    void getMinStepCountFromStartToEnd2() {
        // Arrange
        var input = """
                Sabqponm
                abcryxxl
                accszExk
                acctuvwj
                abdefghi
                """;

        var list = input.lines().toList();
        var heightmap = new Heightmap(list);

        // Act
        var min = heightmap.squares()
                .filter(Square::isLow)
                .map(square -> new Pathfinder(new Heightmap(list), square))
                .mapToInt(Pathfinder::getMinStepCountFromStartToEnd)
                .min();

        // Assert
        assertEquals(OptionalInt.of(29), min);
    }
}

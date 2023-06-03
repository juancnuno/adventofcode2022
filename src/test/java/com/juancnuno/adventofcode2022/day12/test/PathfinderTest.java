package com.juancnuno.adventofcode2022.day12.test;

import com.juancnuno.adventofcode2022.day12.Heightmap;
import com.juancnuno.adventofcode2022.day12.Pathfinder;
import com.juancnuno.adventofcode2022.day12.Square;
import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class PathfinderTest {
    @Test
    public void getMinStepCountFromStartToEnd1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
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
    public void getMinStepCountFromStartToEnd2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
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

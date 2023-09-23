package com.juancnuno.adventofcode2022.test.day14;

import com.juancnuno.adventofcode2022.day14.Slice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class SliceTest {
    @Test
    public void testToString() {
        // Arrange
        var slice = new Slice("""
                498,4 -> 498,6 -> 496,6
                503,4 -> 502,4 -> 502,9 -> 494,9
                """);

        // Act
        var actualString = slice.toString();

        // Assert
        var expectedString = """
                ......+...
                ..........
                ..........
                ..........
                ....#...##
                ....#...#.
                ..###...#.
                ........#.
                ........#.
                #########.
                """;

        assertEquals(expectedString, actualString);
    }
}

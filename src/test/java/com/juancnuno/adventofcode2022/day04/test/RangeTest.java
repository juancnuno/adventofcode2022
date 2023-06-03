package com.juancnuno.adventofcode2022.day04.test;

import com.juancnuno.adventofcode2022.day04.Range;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public final class RangeTest {
    @Test
    public void contains1() {
        // Arrange
        var range1 = new Range("2-8");
        var range2 = new Range("3-7");

        // Act
        var contains = range1.contains(range2);

        // Assert
        assertTrue(contains);
    }

    @Test
    public void contains2() {
        // Arrange
        var range1 = new Range("4-6");
        var range2 = new Range("6-6");

        // Act
        var contains = range1.contains(range2);

        // Assert
        assertTrue(contains);
    }

    @Test
    public void overlaps1() {
        // Arrange
        var range1 = new Range("5-7");
        var range2 = new Range("7-9");

        // Act
        var overlaps = range1.overlaps(range2);

        // Assert
        assertTrue(overlaps);
    }

    @Test
    public void overlaps2() {
        // Arrange
        var range1 = new Range("2-8");
        var range2 = new Range("3-7");

        // Act
        var overlaps = range1.overlaps(range2);

        // Assert
        assertTrue(overlaps);
    }

    @Test
    public void overlaps3() {
        // Arrange
        var range1 = new Range("6-6");
        var range2 = new Range("4-6");

        // Act
        var overlaps = range1.overlaps(range2);

        // Assert
        assertTrue(overlaps);
    }

    @Test
    public void overlaps4() {
        // Arrange
        var range1 = new Range("2-6");
        var range2 = new Range("4-8");

        // Act
        var overlaps = range1.overlaps(range2);

        // Assert
        assertTrue(overlaps);
    }
}

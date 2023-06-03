package com.juancnuno.adventofcode2022.day04.test;

import com.juancnuno.adventofcode2022.day04.RangePair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class RangePairTest {
    private RangePairTest() {
    }

    @Test
    void oneRangeContainsOther1() {
        // Arrange
        var pair = new RangePair("2-8,3-7");

        // Act
        var contains = pair.oneRangeContainsOther();

        // Assert
        assertTrue(contains);
    }

    @Test
    void oneRangeContainsOther2() {
        // Arrange
        var pair = new RangePair("6-6,4-6");

        // Act
        var contains = pair.oneRangeContainsOther();

        // Assert
        assertTrue(contains);
    }
}

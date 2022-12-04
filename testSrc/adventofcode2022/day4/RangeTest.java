package adventofcode2022.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

final class RangeTest {
    private RangeTest() {
    }

    @Test
    void contains1() {
        // Arrange
        var range1 = new Range("2-8");
        var range2 = new Range("3-7");

        // Act
        var contains = range1.contains(range2);

        // Assert
        assertTrue(contains);
    }

    @Test
    void contains2() {
        // Arrange
        var range1 = new Range("4-6");
        var range2 = new Range("6-6");

        // Act
        var contains = range1.contains(range2);

        // Assert
        assertTrue(contains);
    }
}

package com.juancnuno.adventofcode2022.day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class KnotTest {
    private KnotTest() {
    }

    @Test
    void keepUpWith1() {
        // Arrange
        var head = new Knot(new Position(0, 2));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(0, 1), tail.getPosition());
    }

    @Test
    void keepUpWith2() {
        // Arrange
        var head = new Knot(new Position(2, 0));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(1, 0), tail.getPosition());
    }

    @Test
    void keepUpWith3() {
        // Arrange
        var head = new Knot(new Position(-2, 1));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(-1, 1), tail.getPosition());
    }

    @Test
    void keepUpWith4() {
        // Arrange
        var head = new Knot(new Position(-1, 2));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(-1, 1), tail.getPosition());
    }
}

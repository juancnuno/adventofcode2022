package com.juancnuno.adventofcode2022.test.day09;

import com.juancnuno.adventofcode2022.day09.Knot;
import com.juancnuno.adventofcode2022.day09.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class KnotTest {
    @Test
    public void keepUpWith1() {
        // Arrange
        var head = new Knot(new Position(0, 2));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(0, 1), tail.getPosition());
    }

    @Test
    public void keepUpWith2() {
        // Arrange
        var head = new Knot(new Position(2, 0));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(1, 0), tail.getPosition());
    }

    @Test
    public void keepUpWith3() {
        // Arrange
        var head = new Knot(new Position(-2, 1));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(-1, 1), tail.getPosition());
    }

    @Test
    public void keepUpWith4() {
        // Arrange
        var head = new Knot(new Position(-1, 2));
        var tail = new Knot(new Position(0, 0));

        // Act
        tail.keepUpWith(head);

        // Assert
        assertEquals(new Position(-1, 1), tail.getPosition());
    }
}

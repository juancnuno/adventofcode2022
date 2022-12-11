package com.juancnuno.adventofcode2022.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class ItemTest {
    private ItemTest() {
    }

    @Test
    void priority1() {
        // Arrange
        var item = new Item('p');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(16, priority);
    }

    @Test
    void priority2() {
        // Arrange
        var item = new Item('L');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(38, priority);
    }

    @Test
    void priority3() {
        // Arrange
        var item = new Item('P');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(42, priority);
    }

    @Test
    void priority4() {
        // Arrange
        var item = new Item('v');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(22, priority);
    }

    @Test
    void priority5() {
        // Arrange
        var item = new Item('t');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(20, priority);
    }

    @Test
    void priority6() {
        // Arrange
        var item = new Item('s');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(19, priority);
    }
}

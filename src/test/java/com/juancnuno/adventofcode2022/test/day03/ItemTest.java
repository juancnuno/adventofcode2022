package com.juancnuno.adventofcode2022.test.day03;

import com.juancnuno.adventofcode2022.day03.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ItemTest {
    @Test
    public void priority1() {
        // Arrange
        var item = new Item('p');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(16, priority);
    }

    @Test
    public void priority2() {
        // Arrange
        var item = new Item('L');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(38, priority);
    }

    @Test
    public void priority3() {
        // Arrange
        var item = new Item('P');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(42, priority);
    }

    @Test
    public void priority4() {
        // Arrange
        var item = new Item('v');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(22, priority);
    }

    @Test
    public void priority5() {
        // Arrange
        var item = new Item('t');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(20, priority);
    }

    @Test
    public void priority6() {
        // Arrange
        var item = new Item('s');

        // Act
        var priority = item.priority();

        // Assert
        assertEquals(19, priority);
    }
}

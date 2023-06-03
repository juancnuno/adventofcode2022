package com.juancnuno.adventofcode2022.day13.test;

import com.juancnuno.adventofcode2022.day13.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public final class ListTest {
    @Test
    public void compareTo1() {
        // Arrange
        var element1 = Element.parse("[1,1,3,1,1]");
        var element2 = Element.parse("[1,1,5,1,1]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result < 0);
    }

    @Test
    public void compareTo2() {
        // Arrange
        var element1 = Element.parse("[[1],[2,3,4]]");
        var element2 = Element.parse("[[1],4]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result < 0);
    }

    @Test
    public void compareTo3() {
        // Arrange
        var element1 = Element.parse("[9]");
        var element2 = Element.parse("[[8,7,6]]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result > 0);
    }

    @Test
    public void compareTo4() {
        // Arrange
        var element1 = Element.parse("[[4,4],4,4]");
        var element2 = Element.parse("[[4,4],4,4,4]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result < 0);
    }

    @Test
    public void compareTo5() {
        // Arrange
        var element1 = Element.parse("[7,7,7,7]");
        var element2 = Element.parse("[7,7,7]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result > 0);
    }

    @Test
    public void compareTo6() {
        // Arrange
        var element1 = Element.parse("[]");
        var element2 = Element.parse("[3]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result < 0);
    }

    @Test
    public void compareTo7() {
        // Arrange
        var element1 = Element.parse("[[[]]]");
        var element2 = Element.parse("[[]]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result > 0);
    }

    @Test
    public void compareTo8() {
        // Arrange
        var element1 = Element.parse("[1,[2,[3,[4,[5,6,7]]]],8,9]");
        var element2 = Element.parse("[1,[2,[3,[4,[5,6,0]]]],8,9]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertTrue(result > 0);
    }

    @Test
    public void compareTo9() {
        // Arrange
        var element1 = Element.parse("[1,1,3,1,1]");
        var element2 = Element.parse("[1,1,3,1,1]");

        // Act
        var result = element1.compareTo(element2);

        // Assert
        assertEquals(0, result);
    }
}

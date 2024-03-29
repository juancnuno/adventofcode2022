package com.juancnuno.adventofcode2022.test.day13;

import com.juancnuno.adventofcode2022.day13.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ElementTest {
    @Test
    public void parse1() {
        // Act
        var element = Element.parse("[1,1,3,1,1]");

        // Assert
        assertEquals("[1,1,3,1,1]", element.toString());
    }

    @Test
    public void parse2() {
        // Act
        var element = Element.parse("[1,1,5,1,1]");

        // Assert
        assertEquals("[1,1,5,1,1]", element.toString());
    }

    @Test
    public void parse3() {
        // Act
        var element = Element.parse("[[1],[2,3,4]]");

        // Assert
        assertEquals("[[1],[2,3,4]]", element.toString());
    }

    @Test
    public void parse4() {
        // Act
        var element = Element.parse("[[1],4]");

        // Assert
        assertEquals("[[1],4]", element.toString());
    }

    @Test
    public void parse5() {
        // Act
        var element = Element.parse("[9]");

        // Assert
        assertEquals("[9]", element.toString());
    }

    @Test
    public void parse6() {
        // Act
        var element = Element.parse("[[8,7,6]]");

        // Assert
        assertEquals("[[8,7,6]]", element.toString());
    }

    @Test
    public void parse7() {
        // Act
        var element = Element.parse("[[4,4],4,4]");

        // Assert
        assertEquals("[[4,4],4,4]", element.toString());
    }

    @Test
    public void parse8() {
        // Act
        var element = Element.parse("[[4,4],4,4,4]");

        // Assert
        assertEquals("[[4,4],4,4,4]", element.toString());
    }

    @Test
    public void parse9() {
        // Act
        var element = Element.parse("[7,7,7,7]");

        // Assert
        assertEquals("[7,7,7,7]", element.toString());
    }

    @Test
    public void parse10() {
        // Act
        var element = Element.parse("[7,7,7]");

        // Assert
        assertEquals("[7,7,7]", element.toString());
    }

    @Test
    public void parse11() {
        // Act
        var element = Element.parse("[]");

        // Assert
        assertEquals("[]", element.toString());
    }

    @Test
    public void parse12() {
        // Act
        var element = Element.parse("[3]");

        // Assert
        assertEquals("[3]", element.toString());
    }

    @Test
    public void parse13() {
        // Act
        var element = Element.parse("[[[]]]");

        // Assert
        assertEquals("[[[]]]", element.toString());
    }

    @Test
    public void parse14() {
        // Act
        var element = Element.parse("[[]]");

        // Assert
        assertEquals("[[]]", element.toString());
    }

    @Test
    public void parse15() {
        // Act
        var element = Element.parse("[1,[2,[3,[4,[5,6,7]]]],8,9]");

        // Assert
        assertEquals("[1,[2,[3,[4,[5,6,7]]]],8,9]", element.toString());
    }

    @Test
    public void parse16() {
        // Act
        var element = Element.parse("[1,[2,[3,[4,[5,6,0]]]],8,9]");

        // Assert
        assertEquals("[1,[2,[3,[4,[5,6,0]]]],8,9]", element.toString());
    }

    @Test
    public void parse17() {
        // Act
        var element = Element.parse("[[[],[],8,3],[10]]");

        // Assert
        assertEquals("[[[],[],8,3],[10]]", element.toString());
    }
}

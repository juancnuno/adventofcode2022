package com.juancnuno.adventofcode2022.day13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part1Test {
    private Part1Test() {
    }

    @Test
    void getSum() {
        // Arrange
        var part1 = new Part1("""
                [1,1,3,1,1]
                [1,1,5,1,1]

                [[1],[2,3,4]]
                [[1],4]

                [9]
                [[8,7,6]]

                [[4,4],4,4]
                [[4,4],4,4,4]

                [7,7,7,7]
                [7,7,7]

                []
                [3]

                [[[]]]
                [[]]

                [1,[2,[3,[4,[5,6,7]]]],8,9]
                [1,[2,[3,[4,[5,6,0]]]],8,9]
                """);

        // Act
        var sum = part1.getSum();

        // Assert
        assertEquals(13, sum);
    }
}

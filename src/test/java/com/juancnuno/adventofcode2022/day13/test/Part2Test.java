package com.juancnuno.adventofcode2022.day13.test;

import com.juancnuno.adventofcode2022.day13.Part2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part2Test {
    private Part2Test() {
    }

    @Test
    void getDecoderKey() {
        // Arrange
        var part2 = new Part2("""
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
        var key = part2.getDecoderKey();

        // Assert
        assertEquals(140, key);
    }
}

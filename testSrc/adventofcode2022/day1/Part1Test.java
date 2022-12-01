package adventofcode2022.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part1Test {
    @Test
    void getMexCalorieCount() {
        // Arrange
        var part1 = new Part1("""
                1000
                2000
                3000

                4000

                5000
                6000

                7000
                8000
                9000

                10000
                """.lines());

        // Act
        var count = part1.getMexCalorieCount();

        // Assert
        assertEquals(24_000, count);
    }
}

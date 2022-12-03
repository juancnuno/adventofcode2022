package adventofcode2022.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

final class Part2Test {
    private Part2Test() {
    }

    @Test
    void getSumOfPriorities() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var part2 = new Part2("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """.lines());

        // Act
        var sum = part2.getSumOfPriorities();

        // Assert
        assertEquals(70, sum);
    }
}

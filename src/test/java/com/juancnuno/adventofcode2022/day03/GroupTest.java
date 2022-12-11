package com.juancnuno.adventofcode2022.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class GroupTest {
    private GroupTest() {
    }

    @Test
    void getItemInAllRucksacks1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var group = new Group("""
                vJrwpWtwJgWrhcsFMMfFFhFp
                jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
                PmmdzqPrVvPwwTWBwg
                """.lines());

        // Act
        var item = group.getItemInAllRucksacks();

        // Assert
        assertEquals(new Item('r'), item);
    }

    @Test
    void getItemInAllRucksacks2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var group = new Group("""
                wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
                ttgJtRGJQctTZtZT
                CrZsJsPPZsGzwwsLwLmpwMDw
                """.lines());

        // Act
        var item = group.getItemInAllRucksacks();

        // Assert
        assertEquals(new Item('Z'), item);
    }
}

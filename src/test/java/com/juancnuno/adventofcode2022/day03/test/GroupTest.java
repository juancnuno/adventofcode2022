package com.juancnuno.adventofcode2022.day03.test;

import com.juancnuno.adventofcode2022.day03.Group;
import com.juancnuno.adventofcode2022.day03.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
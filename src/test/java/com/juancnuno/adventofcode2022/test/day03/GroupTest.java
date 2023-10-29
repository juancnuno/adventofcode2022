package com.juancnuno.adventofcode2022.test.day03;

import com.juancnuno.adventofcode2022.day03.Group;
import com.juancnuno.adventofcode2022.day03.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class GroupTest {
    @Test
    public void getItemInAllRucksacks1() {
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
    public void getItemInAllRucksacks2() {
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

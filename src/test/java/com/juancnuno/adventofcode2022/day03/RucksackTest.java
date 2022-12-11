package com.juancnuno.adventofcode2022.day03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class RucksackTest {
    private RucksackTest() {
    }

    @Test
    void getItemInBothCompartments1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('p'), item);
    }

    @Test
    void getItemInBothCompartments2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('L'), item);
    }

    @Test
    void getItemInBothCompartments3() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("PmmdzqPrVvPwwTWBwg");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('P'), item);
    }

    @Test
    void getItemInBothCompartments4() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('v'), item);
    }

    @Test
    void getItemInBothCompartments5() {
        // Arrange
        var rucksack = new Rucksack("ttgJtRGJQctTZtZT");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('t'), item);
    }

    @Test
    void getItemInBothCompartments6() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('s'), item);
    }
}

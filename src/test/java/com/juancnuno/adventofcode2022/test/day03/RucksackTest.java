package com.juancnuno.adventofcode2022.test.day03;

import com.juancnuno.adventofcode2022.day03.Item;
import com.juancnuno.adventofcode2022.day03.Rucksack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class RucksackTest {
    @Test
    public void getItemInBothCompartments1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("vJrwpWtwJgWrhcsFMMfFFhFp");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('p'), item);
    }

    @Test
    public void getItemInBothCompartments2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('L'), item);
    }

    @Test
    public void getItemInBothCompartments3() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("PmmdzqPrVvPwwTWBwg");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('P'), item);
    }

    @Test
    public void getItemInBothCompartments4() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('v'), item);
    }

    @Test
    public void getItemInBothCompartments5() {
        // Arrange
        var rucksack = new Rucksack("ttgJtRGJQctTZtZT");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('t'), item);
    }

    @Test
    public void getItemInBothCompartments6() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var rucksack = new Rucksack("CrZsJsPPZsGzwwsLwLmpwMDw");

        // Act
        var item = rucksack.getItemInBothCompartments();

        // Assert
        assertEquals(new Item('s'), item);
    }
}

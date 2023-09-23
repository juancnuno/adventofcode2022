package com.juancnuno.adventofcode2022.test.day06;

import com.juancnuno.adventofcode2022.day06.Scanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class ScannerTest {
    @Test
    public void getStartOfPacketMarkerPosition1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("mjqjpqmgbljsphdztnvjfqwrcgsmlb");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(7, position);
    }

    @Test
    public void getStartOfPacketMarkerPosition2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("bvwbjplbgvbhsrlpgdmjqwftvncz");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(5, position);
    }

    @Test
    public void getStartOfPacketMarkerPosition3() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("nppdvjthqldpwncqszvftbrmjlhg");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(6, position);
    }

    @Test
    public void getStartOfPacketMarkerPosition4() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(10, position);
    }

    @Test
    public void getStartOfPacketMarkerPosition5() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(11, position);
    }

    @Test
    public void getStartOfMessageMarkerPosition1() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("mjqjpqmgbljsphdztnvjfqwrcgsmlb");

        // Act
        var position = scanner.getStartOfMessageMarkerPosition();

        // Assert
        assertEquals(19, position);
    }

    @Test
    public void getStartOfMessageMarkerPosition2() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("bvwbjplbgvbhsrlpgdmjqwftvncz");

        // Act
        var position = scanner.getStartOfMessageMarkerPosition();

        // Assert
        assertEquals(23, position);
    }

    @Test
    public void getStartOfMessageMarkerPosition3() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("nppdvjthqldpwncqszvftbrmjlhg");

        // Act
        var position = scanner.getStartOfMessageMarkerPosition();

        // Assert
        assertEquals(23, position);
    }

    @Test
    public void getStartOfMessageMarkerPosition4() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg");

        // Act
        var position = scanner.getStartOfMessageMarkerPosition();

        // Assert
        assertEquals(29, position);
    }

    @Test
    public void getStartOfMessageMarkerPosition5() {
        // Arrange
        @SuppressWarnings("SpellCheckingInspection")
        var scanner = new Scanner("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");

        // Act
        var position = scanner.getStartOfMessageMarkerPosition();

        // Assert
        assertEquals(26, position);
    }
}

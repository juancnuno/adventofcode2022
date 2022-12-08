package com.juancnuno.adventofcode2022.day6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class ScannerTest {
    private ScannerTest() {
    }

    @Test
    void getStartOfPacketMarkerPosition1() {
        // Arrange
        var scanner = new Scanner("mjqjpqmgbljsphdztnvjfqwrcgsmlb");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(7, position);
    }

    @Test
    void getStartOfPacketMarkerPosition2() {
        // Arrange
        var scanner = new Scanner("bvwbjplbgvbhsrlpgdmjqwftvncz");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(5, position);
    }

    @Test
    void getStartOfPacketMarkerPosition3() {
        // Arrange
        var scanner = new Scanner("nppdvjthqldpwncqszvftbrmjlhg");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(6, position);
    }

    @Test
    void getStartOfPacketMarkerPosition4() {
        // Arrange
        var scanner = new Scanner("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(10, position);
    }

    @Test
    void getStartOfPacketMarkerPosition5() {
        // Arrange
        var scanner = new Scanner("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw");

        // Act
        var position = scanner.getStartOfPacketMarkerPosition();

        // Assert
        assertEquals(11, position);
    }
}

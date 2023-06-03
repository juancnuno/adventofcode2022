package com.juancnuno.adventofcode2022.test.day10;

import com.juancnuno.adventofcode2022.day10.Device;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class DeviceTest {
    @Test
    public void tick1() {
        // Arrange
        var input = """
                noop
                addx 3
                addx -5
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();

        // Assert
        assertEquals(1, device.getCpu().getX());
    }

    @Test
    public void tick2() {
        // Arrange
        var input = """
                noop
                addx 3
                addx -5
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();

        // Assert
        assertEquals(1, device.getCpu().getX());
    }

    @Test
    public void tick3() {
        // Arrange
        var input = """
                noop
                addx 3
                addx -5
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();
        device.tick();

        // Assert
        assertEquals(4, device.getCpu().getX());
    }

    @Test
    public void tick4() {
        // Arrange
        var input = """
                noop
                addx 3
                addx -5
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();
        device.tick();
        device.tick();

        // Assert
        assertEquals(4, device.getCpu().getX());
    }

    @Test
    public void tick5() {
        // Arrange
        var input = """
                noop
                addx 3
                addx -5
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();
        device.tick();
        device.tick();
        device.tick();

        // Assert
        assertEquals(-1, device.getCpu().getX());
    }

    @Test
    public void getSignalStrengthSum() {
        // Arrange
        var input = """
                addx 15
                addx -11
                addx 6
                addx -3
                addx 5
                addx -1
                addx -8
                addx 13
                addx 4
                noop
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx -35
                addx 1
                addx 24
                addx -19
                addx 1
                addx 16
                addx -11
                noop
                noop
                addx 21
                addx -15
                noop
                noop
                addx -3
                addx 9
                addx 1
                addx -3
                addx 8
                addx 1
                addx 5
                noop
                noop
                noop
                noop
                noop
                addx -36
                noop
                addx 1
                addx 7
                noop
                noop
                noop
                addx 2
                addx 6
                noop
                noop
                noop
                noop
                noop
                addx 1
                noop
                noop
                addx 7
                addx 1
                noop
                addx -13
                addx 13
                addx 7
                noop
                addx 1
                addx -33
                noop
                noop
                noop
                addx 2
                noop
                noop
                noop
                addx 8
                noop
                addx -1
                addx 2
                addx 1
                noop
                addx 17
                addx -9
                addx 1
                addx 1
                addx -3
                addx 11
                noop
                noop
                addx 1
                noop
                addx 1
                noop
                noop
                addx -13
                addx -19
                addx 1
                addx 3
                addx 26
                addx -30
                addx 12
                addx -1
                addx 3
                addx 1
                noop
                noop
                noop
                addx -9
                addx 18
                addx 1
                addx 2
                noop
                noop
                addx 9
                noop
                noop
                noop
                addx -1
                addx 2
                addx -37
                addx 1
                addx 3
                noop
                addx 15
                addx -21
                addx 22
                addx -6
                addx 1
                noop
                addx 2
                addx 1
                noop
                addx -10
                noop
                noop
                addx 20
                addx 1
                addx 2
                addx 2
                addx -6
                addx -11
                noop
                noop
                noop
                """;

        var device = new Device(input.lines());

        // Act
        device.runProgram();

        // Assert
        assertEquals(13_140, device.getSignalStrengthSum());
    }

    @Test
    public void tick6() {
        // Arrange
        var input = """
                addx 15
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();

        // Assert
        var expected = """
                ##......................................
                ........................................
                ........................................
                ........................................
                ........................................
                ........................................
                """;

        assertEquals(expected, device.getCrt().toString());
    }

    @Test
    public void tick7() {
        // Arrange
        var input = """
                addx 15
                addx -11
                """;

        var device = new Device(input.lines());

        // Act
        device.tick();
        device.tick();
        device.tick();

        // Assert
        var expected = """
                ##......................................
                ........................................
                ........................................
                ........................................
                ........................................
                ........................................
                """;

        assertEquals(expected, device.getCrt().toString());
    }

    @Test
    public void tick8() {
        // Arrange
        var input = """
                addx 15
                addx -11
                addx 6
                addx -3
                addx 5
                addx -1
                addx -8
                addx 13
                addx 4
                noop
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx 5
                addx -1
                addx -35
                addx 1
                addx 24
                addx -19
                addx 1
                addx 16
                addx -11
                noop
                noop
                addx 21
                addx -15
                noop
                noop
                addx -3
                addx 9
                addx 1
                addx -3
                addx 8
                addx 1
                addx 5
                noop
                noop
                noop
                noop
                noop
                addx -36
                noop
                addx 1
                addx 7
                noop
                noop
                noop
                addx 2
                addx 6
                noop
                noop
                noop
                noop
                noop
                addx 1
                noop
                noop
                addx 7
                addx 1
                noop
                addx -13
                addx 13
                addx 7
                noop
                addx 1
                addx -33
                noop
                noop
                noop
                addx 2
                noop
                noop
                noop
                addx 8
                noop
                addx -1
                addx 2
                addx 1
                noop
                addx 17
                addx -9
                addx 1
                addx 1
                addx -3
                addx 11
                noop
                noop
                addx 1
                noop
                addx 1
                noop
                noop
                addx -13
                addx -19
                addx 1
                addx 3
                addx 26
                addx -30
                addx 12
                addx -1
                addx 3
                addx 1
                noop
                noop
                noop
                addx -9
                addx 18
                addx 1
                addx 2
                noop
                noop
                addx 9
                noop
                noop
                noop
                addx -1
                addx 2
                addx -37
                addx 1
                addx 3
                noop
                addx 15
                addx -21
                addx 22
                addx -6
                addx 1
                noop
                addx 2
                addx 1
                noop
                addx -10
                noop
                noop
                addx 20
                addx 1
                addx 2
                addx 2
                addx -6
                addx -11
                noop
                noop
                noop
                """;

        var device = new Device(input.lines());

        // Act
        device.runProgram();

        // Assert
        var expected = """
                ##..##..##..##..##..##..##..##..##..##..
                ###...###...###...###...###...###...###.
                ####....####....####....####....####....
                #####.....#####.....#####.....#####.....
                ######......######......######......####
                #######.......#######.......#######.....
                """;

        assertEquals(expected, device.getCrt().toString());
    }
}

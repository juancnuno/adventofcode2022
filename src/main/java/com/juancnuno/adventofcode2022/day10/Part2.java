package com.juancnuno.adventofcode2022.day10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) throws IOException {
        try (var instructions = Files.lines(Path.of(args[0]))) {
            var device = new Device(instructions);
            device.runProgram();

            System.out.println(device.getCrt());
        }
    }
}

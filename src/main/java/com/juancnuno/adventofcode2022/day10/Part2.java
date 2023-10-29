package com.juancnuno.adventofcode2022.day10;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(instructions -> {
            var device = new Device(instructions);
            device.runProgram();

            return device.getCrt();
        });
    }
}

package com.juancnuno.adventofcode2022.day10;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(instructions -> new Device(instructions).getSignalStrengthSum());
    }
}

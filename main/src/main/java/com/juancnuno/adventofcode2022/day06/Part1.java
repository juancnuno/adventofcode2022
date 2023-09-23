package com.juancnuno.adventofcode2022.day06;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultString(buffer -> new Scanner(buffer).getStartOfPacketMarkerPosition());
    }
}

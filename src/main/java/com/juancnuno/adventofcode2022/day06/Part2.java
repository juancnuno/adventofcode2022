package com.juancnuno.adventofcode2022.day06;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultString(buffer -> new Scanner(buffer).getStartOfMessageMarkerPosition());
    }
}

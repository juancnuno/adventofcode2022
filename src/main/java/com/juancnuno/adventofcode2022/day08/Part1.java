package com.juancnuno.adventofcode2022.day08;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultList(lines -> new Grid(lines).getVisibleTreeCount());
    }
}

package com.juancnuno.adventofcode2022.day08;

import com.juancnuno.adventofcode.AdventOfCode;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultList(lines -> new Grid(lines).getMaxScenicScore());
    }
}

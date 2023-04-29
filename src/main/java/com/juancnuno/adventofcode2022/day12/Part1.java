package com.juancnuno.adventofcode2022.day12;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResult(rows -> new Pathfinder(new Heightmap(rows.toList())).getMinStepCountFromStartToEnd());
    }
}

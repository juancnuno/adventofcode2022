package com.juancnuno.adventofcode2022.day12;

import com.juancnuno.adventofcode.AdventOfCode;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(stream -> {
            var list = stream.toList();

            return new Heightmap(list).squares()
                    .filter(Square::isLow)
                    .map(square -> new Pathfinder(new Heightmap(list), square))
                    .mapToInt(Pathfinder::getMinStepCountFromStartToEnd)
                    .min();
        });
    }
}

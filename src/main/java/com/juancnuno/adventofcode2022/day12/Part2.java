package com.juancnuno.adventofcode2022.day12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) throws IOException {
        try (var stream = Files.lines(Path.of(args[0]))) {
            var list = stream.toList();

            var min = new Heightmap(list).squares()
                    .filter(Square::isLow)
                    .map(square -> new Pathfinder(new Heightmap(list), square))
                    .mapToInt(Pathfinder::getMinStepCountFromStartToEnd)
                    .min();

            System.out.println(min);
        }
    }
}

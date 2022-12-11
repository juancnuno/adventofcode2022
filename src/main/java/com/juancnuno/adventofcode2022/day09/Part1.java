package com.juancnuno.adventofcode2022.day09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

final class Part1 {
    private final Stream<String> motions;
    private final Rope rope;
    private final Collection<Position> positions;

    Part1(Stream<String> motions) {
        this.motions = motions;
        rope = new Rope(2);

        positions = new HashSet<>();
        positions.add(rope.getTail().getPosition());
    }

    int getPositionCount() {
        motions
                .map(Motion::parse)
                .forEach(motion -> motion.move(rope, positions));

        return positions.size();
    }

    public static void main(String[] args) throws IOException {
        try (var motions = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part1(motions).getPositionCount());
        }
    }
}

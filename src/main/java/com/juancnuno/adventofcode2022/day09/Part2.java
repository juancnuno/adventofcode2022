package com.juancnuno.adventofcode2022.day09;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Stream;

public final class Part2 {
    private final Stream<String> motions;
    public final Rope rope;
    private final Collection<Position> positions;

    public Part2(Stream<String> motions) {
        this.motions = motions;
        rope = new Rope(10);

        positions = new HashSet<>();
        positions.add(rope.getTail().getPosition());
    }

    public int getPositionCount() {
        motions
                .map(Motion::parse)
                .forEach(motion -> motion.move(rope, positions));

        return positions.size();
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(motions -> new Part2(motions).getPositionCount());
    }
}

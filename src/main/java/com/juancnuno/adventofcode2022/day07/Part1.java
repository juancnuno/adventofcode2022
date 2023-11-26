package com.juancnuno.adventofcode2022.day07;

import com.juancnuno.adventofcode.AdventOfCode;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> {
            var filesystem = new Filesystem(lines);
            filesystem.handleLines();

            return filesystem.getRoot().directories()
                    .mapToInt(File::getTotalSize)
                    .filter(size -> size <= 100_000)
                    .sum();
        });
    }
}

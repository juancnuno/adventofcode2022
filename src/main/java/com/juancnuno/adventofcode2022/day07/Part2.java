package com.juancnuno.adventofcode2022.day07;

import com.juancnuno.adventofcode2022.AdventOfCode;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) {
        AdventOfCode.printResultStream(lines -> {
            var filesystem = new Filesystem(lines);
            filesystem.handleLines();

            var root = filesystem.getRoot();

            var unusedSpace = 70_000_000 - root.getTotalSize();
            var neededSpace = 30_000_000 - unusedSpace;

            return root.directories()
                    .mapToInt(File::getTotalSize)
                    .filter(s -> s >= neededSpace)
                    .min();
        });
    }
}

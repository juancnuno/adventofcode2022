package com.juancnuno.adventofcode2022.day7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            var filesystem = new Filesystem(lines);
            filesystem.handleLines();

            var root = filesystem.getRoot();

            var unusedSpace = 70_000_000 - root.getTotalSize();
            var neededSpace = 30_000_000 - unusedSpace;

            var size = root.directories()
                    .mapToInt(File::getTotalSize)
                    .filter(s -> s >= neededSpace)
                    .min();

            System.out.println(size);
        }
    }
}

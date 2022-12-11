package com.juancnuno.adventofcode2022.day07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            var filesystem = new Filesystem(lines);
            filesystem.handleLines();

            var sum = filesystem.getRoot().directories()
                    .mapToInt(File::getTotalSize)
                    .filter(size -> size <= 100_000)
                    .sum();

            System.out.println(sum);
        }
    }
}

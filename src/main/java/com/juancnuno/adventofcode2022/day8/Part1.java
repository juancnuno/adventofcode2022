package com.juancnuno.adventofcode2022.day8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Grid(Files.readAllLines(Path.of(args[0]))).getVisibleTreeCount());
    }
}

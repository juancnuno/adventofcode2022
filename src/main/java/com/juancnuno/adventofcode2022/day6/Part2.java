package com.juancnuno.adventofcode2022.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part2 {
    private Part2() {
    }

    public static void main(String[] args) throws IOException {
        var input = Path.of(args[0]);
        System.out.println(new Scanner(Files.readString(input)).getStartOfMessageMarkerPosition());
    }
}

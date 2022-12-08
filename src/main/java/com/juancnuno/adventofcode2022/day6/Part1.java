package com.juancnuno.adventofcode2022.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) throws IOException {
        var input = Path.of(args[0]);
        System.out.println(new Scanner(Files.readString(input)).getStartOfPacketMarkerPosition());
    }
}

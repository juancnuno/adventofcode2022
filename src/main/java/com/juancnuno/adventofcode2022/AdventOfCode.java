package com.juancnuno.adventofcode2022;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class AdventOfCode {
    private AdventOfCode() {
    }

    public static String readStringFromInputTxt() {
        try {
            return Files.readString(Path.of(System.getProperty("user.home"), "input.txt"));
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }
}

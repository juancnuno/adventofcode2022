package com.juancnuno.adventofcode2022;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.stream.Stream;

public final class AdventOfCode {
    private AdventOfCode() {
    }

    public static void printResult(Function<Stream<String>, Object> function) {
        try (var lines = Files.lines(Path.of(System.getProperty("user.home"), "input.txt"))) {
            System.out.println(function.apply(lines));
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }

    public static String readStringFromInputTxt() {
        try {
            return Files.readString(Path.of(System.getProperty("user.home"), "input.txt"));
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }
}

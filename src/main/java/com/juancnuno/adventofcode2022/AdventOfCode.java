package com.juancnuno.adventofcode2022;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public final class AdventOfCode {
    private AdventOfCode() {
    }

    public static void printResultStream(Function<Stream<String>, Object> function) {
        try (var lines = Files.lines(Path.of(System.getProperty("user.home"), "input.txt"))) {
            System.out.println(function.apply(lines));
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }

    public static void printResultString(ToIntFunction<String> function) {
        try {
            var home = System.getProperty("user.home");
            System.out.println(function.applyAsInt(Files.readString(Path.of(home, "input.txt"))));
        } catch (IOException exception) {
            throw new UncheckedIOException(exception);
        }
    }
}

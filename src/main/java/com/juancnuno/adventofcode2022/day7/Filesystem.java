package com.juancnuno.adventofcode2022.day7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

final class Filesystem {
    private static final Pattern LS_OUTPUT_LINE = Pattern.compile("(\\d+) (.+)");

    private final Stream<String> lines;
    private final Directory root;

    private Directory current;

    Filesystem(Stream<String> lines) {
        this.lines = lines;
        root = new Directory();
    }

    void handleLines() {
        lines.forEach(this::handleLine);
    }

    private void handleLine(String line) {
        if (line.startsWith("$ cd ")) {
            cd(line.substring(5));
            return;
        }

        if (line.equals("$ ls")) {
            return;
        }

        handleLsOutputLine(line);
    }

    private void cd(String directory) {
        current = switch (directory) {
            case ".." -> current.getParent();
            case "/" -> root;
            default -> current.findDirectory(directory);
        };
    }

    private void handleLsOutputLine(String line) {
        if (line.startsWith("dir ")) {
            current.addFile(new Directory(line.substring(4), current));
            return;
        }

        Matcher matcher = LS_OUTPUT_LINE.matcher(line);

        if (!matcher.matches()) {
            assert false;
        }

        current.addFile(new File(matcher.group(2), Integer.parseInt(matcher.group(1)), current));
    }

    Directory getRoot() {
        return root;
    }
}

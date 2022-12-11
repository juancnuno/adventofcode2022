package com.juancnuno.adventofcode2022.day07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

final class Directory extends File {
    private final Collection<File> files;

    Directory() {
        this("/", null);
    }

    Directory(String name, Directory parent) {
        super(name, 0, parent);
        files = new ArrayList<>();
    }

    void addFile(File file) {
        files.add(file);
    }

    Directory findDirectory(String name) {
        var directory = files.stream()
                .filter(file -> file.name.equals(name))
                .findFirst();

        return (Directory) directory.orElseThrow();
    }

    Stream<File> directories() {
        var directories = Stream.<File>builder();
        addThisAndChildDirectories(directories);

        return directories.build();
    }

    private void addThisAndChildDirectories(Stream.Builder<File> directories) {
        directories.add(this);

        files.stream()
                .filter(Directory.class::isInstance)
                .map(Directory.class::cast)
                .forEach(directory -> directory.addThisAndChildDirectories(directories));
    }

    @Override
    int getTotalSize() {
        return files.stream()
                .mapToInt(File::getTotalSize)
                .sum();
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    String toString(int indentLevel) {
        var builder = new StringBuilder();

        builder
                .append("  ".repeat(indentLevel))
                .append("- ")
                .append(name)
                .append(" (dir)")
                .append(System.lineSeparator());

        var newIndentLevel = indentLevel + 1;

        files.stream()
                .map(file -> file.toString(newIndentLevel))
                .forEach(builder::append);

        return builder.toString();
    }
}

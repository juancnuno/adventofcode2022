package com.juancnuno.adventofcode2022.day07;

public class File {
    final Object name;
    private final int size;
    private final Directory parent;

    File(String name, int size, Directory parent) {
        this.name = name;
        this.size = size;
        this.parent = parent;
    }

    public int getTotalSize() {
        return size;
    }

    final Directory getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    String toString(int indentLevel) {
        return "  ".repeat(indentLevel) + "- " + name + " (file, size=" + size + ")"
                + System.lineSeparator();
    }
}

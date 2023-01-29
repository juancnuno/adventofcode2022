package com.juancnuno.adventofcode2022.day10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Crt {
    private static final int ROW_COUNT = 6;
    private static final int COLUMN_COUNT = 40;

    private final Sprite sprite;
    private final List<List<Character>> pixels;

    private int rowIndex;
    private int columnIndex;

    Crt() {
        sprite = new Sprite();

        pixels = IntStream.range(0, ROW_COUNT)
                .mapToObj(rowIndex -> collectColumns())
                .toList();
    }

    private static List<Character> collectColumns() {
        return IntStream.range(0, COLUMN_COUNT)
                .mapToObj(columnIndex -> '.')
                .collect(Collectors.toList());
    }

    void draw(Cpu cpu) {
        sprite.setPosition(cpu.getX());

        if (sprite.contains(columnIndex)) {
            pixels.get(rowIndex).set(columnIndex, '#');
        }

        columnIndex++;

        if (columnIndex == COLUMN_COUNT) {
            rowIndex++;
            columnIndex = 0;
        }
    }

    @Override
    public String toString() {
        var builder = new StringBuilder(ROW_COUNT * COLUMN_COUNT);

        IntStream.range(0, ROW_COUNT)
                .mapToObj(pixels::get)
                .forEach(row -> append(builder, row));

        return builder.toString();
    }

    private static void append(StringBuilder builder, List<Character> row) {
        IntStream.range(0, COLUMN_COUNT)
                .mapToObj(row::get)
                .forEach(builder::append);

        builder.append(System.lineSeparator());
    }
}

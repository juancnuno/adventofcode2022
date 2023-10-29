package com.juancnuno.adventofcode2022.day12;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Heightmap {
    private final List<List<Square>> rows;

    public Heightmap(List<String> rows) {
        this.rows = IntStream.range(0, rows.size())
                .mapToObj(rowIndex -> toRow(rows.get(rowIndex), rowIndex))
                .toList();
    }

    private static List<Square> toRow(CharSequence line, int rowIndex) {
        return IntStream.range(0, line.length())
                .mapToObj(columnIndex -> newSquare(line, rowIndex, columnIndex))
                .collect(Collectors.toList());
    }

    private static Square newSquare(CharSequence line, int rowIndex, int columnIndex) {
        return new Square(line.charAt(columnIndex), rowIndex, columnIndex, Integer.MAX_VALUE);
    }

    Square find(Predicate<Square> predicate) {
        var square = squares()
                .filter(predicate)
                .findFirst();

        return square.orElseThrow();
    }

    public Stream<Square> squares() {
        return rows.stream().flatMap(Collection::stream);
    }

    int getRowCount() {
        return rows.size();
    }

    int getColumnCount() {
        return rows.get(0).size();
    }

    Square get(int rowIndex, int columnIndex) {
        return rows.get(rowIndex).get(columnIndex);
    }

    void set(int rowIndex, int columnIndex, Square square) {
        rows.get(rowIndex).set(columnIndex, square);
    }
}

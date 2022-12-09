package com.juancnuno.adventofcode2022.day8;

import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

final class Grid {
    private final List<List<Tree>> rows;

    Grid(List<String> lines) {
        rows = IntStream.range(0, lines.size())
                .mapToObj(rowIndex -> toRow(lines.get(rowIndex), rowIndex))
                .toList();
    }

    private List<Tree> toRow(CharSequence line, int rowIndex) {
        return IntStream.range(0, line.length())
                .mapToObj(columnIndex -> newTree(line, rowIndex, columnIndex))
                .toList();

    }

    private Tree newTree(CharSequence line, int rowIndex, int columnIndex) {
        var height = Integer.parseInt(String.valueOf(line.charAt(columnIndex)));
        return new Tree(height, rowIndex, columnIndex, this);
    }

    List<List<Tree>> getRows() {
        return rows;
    }

    int getVisibleTreeCount() {
        return (int) rows.stream()
                .flatMap(Collection::stream)
                .filter(Tree::isVisible)
                .count();
    }
}

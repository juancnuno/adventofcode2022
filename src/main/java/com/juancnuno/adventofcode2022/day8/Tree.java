package com.juancnuno.adventofcode2022.day8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

final class Tree {
    private final int height;
    private final int rowIndex;
    private final int columnIndex;
    private final Grid grid;

    Tree(int height, int rowIndex, int columnIndex, Grid grid) {
        this.height = height;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.grid = grid;
    }

    boolean isVisible() {
        return isTallerThan(topTrees()) || isTallerThan(bottomTrees()) || isTallerThan(leftTrees())
                || isTallerThan(rightTrees());
    }

    private boolean isTallerThan(Stream<Tree> trees) {
        return trees
                .mapToInt(tree -> tree.height)
                .allMatch(height -> this.height > height);
    }

    private Stream<Tree> topTrees() {
        return IntStream.range(0, rowIndex)
                .mapToObj(grid.getRows()::get)
                .map(row -> row.get(columnIndex));
    }

    private Stream<Tree> bottomTrees() {
        var rows = grid.getRows();

        return IntStream.range(rowIndex + 1, rows.size())
                .mapToObj(rows::get)
                .map(row -> row.get(columnIndex));
    }

    private Stream<Tree> leftTrees() {
        return grid.getRows().get(rowIndex).subList(0, columnIndex).stream();
    }

    private Stream<Tree> rightTrees() {
        var row = grid.getRows().get(rowIndex);
        return row.subList(columnIndex + 1, row.size()).stream();
    }
}

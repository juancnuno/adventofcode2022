package com.juancnuno.adventofcode2022.day08;

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
        return topTrees().allMatch(this::isTallerThan)
                || bottomTrees().allMatch(this::isTallerThan)
                || leftTrees().allMatch(this::isTallerThan)
                || rightTrees().allMatch(this::isTallerThan);
    }

    private boolean isTallerThan(Tree tree) {
        return height > tree.height;
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

    int getScenicScore() {
        return getTopViewingDistance() * getBottomViewingDistance() * getLeftViewingDistance()
                * getRightViewingDistance();
    }

    private int getTopViewingDistance() {
        var distance = 0;
        var rows = grid.getRows();

        for (var rowIndex = this.rowIndex - 1; rowIndex >= 0; rowIndex--) {
            distance++;

            if (!isTallerThan(rows.get(rowIndex).get(columnIndex))) {
                break;
            }
        }

        return distance;
    }

    private int getBottomViewingDistance() {
        var distance = 0;
        var rows = grid.getRows();

        for (int rowIndex = this.rowIndex + 1, rowCount = rows.size(); rowIndex < rowCount; rowIndex++) {
            distance++;

            if (!isTallerThan(rows.get(rowIndex).get(columnIndex))) {
                break;
            }
        }

        return distance;
    }

    private int getLeftViewingDistance() {
        var distance = 0;
        var row = grid.getRows().get(rowIndex);

        for (var columnIndex = this.columnIndex - 1; columnIndex >= 0; columnIndex--) {
            distance++;

            if (!isTallerThan(row.get(columnIndex))) {
                break;
            }
        }

        return distance;
    }

    private int getRightViewingDistance() {
        var distance = 0;
        var row = grid.getRows().get(rowIndex);

        for (int columnIndex = this.columnIndex + 1,
                columnCount = row.size(); columnIndex < columnCount; columnIndex++) {
            distance++;

            if (!isTallerThan(row.get(columnIndex))) {
                break;
            }
        }

        return distance;
    }
}

package com.juancnuno.adventofcode2022.day08;

import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Grid {
    private final List<List<Tree>> rows;

    public Grid(List<String> lines) {
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

    public List<List<Tree>> getRows() {
        return rows;
    }

    public int getVisibleTreeCount() {
        return (int) trees()
                .filter(Tree::isVisible)
                .count();
    }

    public int getMaxScenicScore() {
        var score = trees()
                .mapToInt(Tree::getScenicScore)
                .max();

        return score.orElse(0);
    }

    private Stream<Tree> trees() {
        return rows.stream().flatMap(Collection::stream);
    }
}

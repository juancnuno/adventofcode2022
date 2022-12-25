package com.juancnuno.adventofcode2022.day12;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Heightmap {
    private final List<List<Square>> rows;

    Heightmap(List<String> rows) {
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
        return new Square(line.charAt(columnIndex), rowIndex, columnIndex);
    }

    int getMinStepCountFromStartToEnd() {
        var unvisitedSquares = rows.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toCollection(TreeSet::new));

        var currentSquare = find(Square::isStart);

        while (isEndUnvisited(unvisitedSquares)) {
            considerUnvisitedNeighbors(currentSquare, unvisitedSquares);

            unvisitedSquares.remove(currentSquare);

            if (unvisitedSquares.isEmpty()) {
                break;
            }

            currentSquare = unvisitedSquares.first();
        }

        return find(Square::isEnd).distance();
    }

    private Square find(Predicate<Square> predicate) {
        var square = rows.stream()
                .flatMap(Collection::stream)
                .filter(predicate)
                .findFirst();

        return square.orElseThrow();
    }

    private static boolean isEndUnvisited(Collection<Square> unvisitedSquares) {
        return unvisitedSquares.stream().anyMatch(Square::isEnd);
    }

    private void considerUnvisitedNeighbors(Square currentSquare, Collection<Square> unvisitedSquares) {
        currentSquare.unvisitedNeighbors(this, unvisitedSquares)
                .forEach(neighbor -> setDistance(neighbor, currentSquare, unvisitedSquares));
    }

    private void setDistance(Square oldNeighbor, Square currentSquare, Collection<Square> unvisitedSquares) {
        var newDistance = currentSquare.distance() + 1;

        if (oldNeighbor.distance() <= newDistance) {
            return;
        }

        var newNeighbor = oldNeighbor.setDistance(newDistance);
        set(oldNeighbor.rowIndex(), oldNeighbor.columnIndex(), newNeighbor);

        unvisitedSquares.remove(oldNeighbor);
        unvisitedSquares.add(newNeighbor);
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

    private void set(int rowIndex, int columnIndex, Square square) {
        rows.get(rowIndex).set(columnIndex, square);
    }
}

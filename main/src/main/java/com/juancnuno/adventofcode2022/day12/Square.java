package com.juancnuno.adventofcode2022.day12;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public record Square(char elevation, int rowIndex, int columnIndex, int distance) implements Comparable<Square> {

    private static final Comparator<Square> COMPARATOR = Comparator.comparing(Square::distance)
            .thenComparing(Square::elevation)
            .thenComparing(Square::rowIndex)
            .thenComparing(Square::columnIndex);

    boolean isStart() {
        return elevation == 'S';
    }

    boolean isEnd() {
        return elevation == 'E';
    }

    public boolean isLow() {
        return elevation == 'S' || elevation == 'a';
    }

    Stream<Square> unvisitedNeighbors(Heightmap heightmap, Collection<Square> unvisitedNeighbors) {
        return Stream
                .of(topNeighbor(heightmap), bottomNeighbor(heightmap), leftNeighbor(heightmap),
                        rightNeighbor(heightmap))
                .flatMap(Optional::stream)
                .filter(this::isNeighborReachable)
                .filter(unvisitedNeighbors::contains);
    }

    private Optional<Square> topNeighbor(Heightmap heightmap) {
        if (rowIndex == 0) {
            return Optional.empty();
        }

        return Optional.of(heightmap.get(rowIndex - 1, columnIndex));
    }

    private Optional<Square> bottomNeighbor(Heightmap heightmap) {
        if (rowIndex == heightmap.getRowCount() - 1) {
            return Optional.empty();
        }

        return Optional.of(heightmap.get(rowIndex + 1, columnIndex));
    }

    private Optional<Square> leftNeighbor(Heightmap heightmap) {
        if (columnIndex == 0) {
            return Optional.empty();
        }

        return Optional.of(heightmap.get(rowIndex, columnIndex - 1));
    }

    private Optional<Square> rightNeighbor(Heightmap heightmap) {
        if (columnIndex == heightmap.getColumnCount() - 1) {
            return Optional.empty();
        }

        return Optional.of(heightmap.get(rowIndex, columnIndex + 1));
    }

    private boolean isNeighborReachable(Square neighbor) {
        var neighborElevation = neighbor.elevation2();
        var elevation = elevation2();

        if (neighborElevation <= elevation) {
            return true;
        }

        return neighborElevation - elevation == 1;
    }

    private char elevation2() {
        return switch (elevation) {
            case 'S' -> 'a';
            case 'E' -> 'z';
            default -> elevation;
        };
    }

    Square setDistance(int distance) {
        return new Square(elevation, rowIndex, columnIndex, distance);
    }

    @Override
    public int compareTo(Square square) {
        return COMPARATOR.compare(this, square);
    }
}

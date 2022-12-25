package com.juancnuno.adventofcode2022.day12;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

final class Pathfinder {
    private final Heightmap heightmap;
    private final Square start;

    private SortedSet<Square> unvisitedSquares;
    private Square currentSquare;

    Pathfinder(Heightmap heightmap) {
        this(heightmap, heightmap.find(Square::isStart));
    }

    Pathfinder(Heightmap heightmap, Square start) {
        this.heightmap = heightmap;
        this.start = start;
    }

    int getMinStepCountFromStartToEnd() {
        unvisitedSquares = heightmap.squares().collect(Collectors.toCollection(TreeSet::new));

        unvisitedSquares.remove(start);
        currentSquare = start.setDistance(0);
        unvisitedSquares.add(currentSquare);

        while (isEndUnvisited()) {
            currentSquare.unvisitedNeighbors(heightmap, unvisitedSquares).forEach(this::setDistance);
            unvisitedSquares.remove(currentSquare);

            if (unvisitedSquares.isEmpty()) {
                break;
            }

            currentSquare = unvisitedSquares.first();
        }

        return heightmap.find(Square::isEnd).distance();
    }

    private boolean isEndUnvisited() {
        return unvisitedSquares.stream().anyMatch(Square::isEnd);
    }

    private void setDistance(Square oldNeighbor) {
        var newDistance = currentSquare.distance() + 1;

        if (oldNeighbor.distance() <= newDistance) {
            return;
        }

        var newNeighbor = oldNeighbor.setDistance(newDistance);
        heightmap.set(oldNeighbor.rowIndex(), oldNeighbor.columnIndex(), newNeighbor);

        unvisitedSquares.remove(oldNeighbor);
        unvisitedSquares.add(newNeighbor);
    }
}

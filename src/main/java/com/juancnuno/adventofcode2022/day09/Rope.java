package com.juancnuno.adventofcode2022.day09;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

final class Rope {
    private final List<Knot> knots;

    Rope(int length) {
        knots = Stream.generate(Knot::new)
                .limit(length)
                .toList();
    }

    void dragUp() {
        knots.get(0).moveUp();
        dragBody();
    }

    void dragDown() {
        knots.get(0).moveDown();
        dragBody();
    }

    void dragLeft() {
        knots.get(0).moveLeft();
        dragBody();
    }

    void dragRight() {
        knots.get(0).moveRight();
        dragBody();
    }

    private void dragBody() {
        for (int knotIndex = 1, length = knots.size(); knotIndex < length; knotIndex++) {
            var current = knots.get(knotIndex);
            var previous = knots.get(knotIndex - 1);

            if (current.isTouching(previous)) {
                break;
            }

            current.keepUpWith(previous);
        }
    }

    Knot getTail() {
        return knots.get(knots.size() - 1);
    }

    @Override
    public String toString() {
        var minRowIndex = knots.stream()
                .map(Knot::getPosition)
                .mapToInt(Position::rowIndex)
                .min()
                .orElse(0);

        var maxRowIndex = knots.stream()
                .map(Knot::getPosition)
                .mapToInt(Position::rowIndex)
                .max()
                .orElse(0);

        var minColumnIndex = knots.stream()
                .map(Knot::getPosition)
                .mapToInt(Position::columnIndex)
                .min()
                .orElse(0);

        var maxColumnIndex = knots.stream()
                .map(Knot::getPosition)
                .mapToInt(Position::columnIndex)
                .max()
                .orElse(0);

        var map = new HashMap<>();

        for (var knotIndex = knots.size() - 1; knotIndex > 0; knotIndex--) {
            map.put(knots.get(knotIndex).getPosition(), Integer.toString(knotIndex).charAt(0));
        }

        map.put(knots.get(0).getPosition(), 'H');

        var builder = new StringBuilder();
        var separator = System.lineSeparator();

        for (var rowIndex = minRowIndex; rowIndex <= maxRowIndex; rowIndex++) {
            for (var columnIndex = minColumnIndex; columnIndex <= maxColumnIndex; columnIndex++) {
                var name = map.get(new Position(rowIndex, columnIndex));
                builder.append(name == null ? '.' : name);
            }

            builder.append(separator);
        }

        return builder.toString();
    }
}

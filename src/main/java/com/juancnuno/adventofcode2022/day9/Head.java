package com.juancnuno.adventofcode2022.day9;

final class Head extends Knot {
    void dragUp(Knot tail) {
        position = position.decrementRowIndex();

        if (isTouching(tail)) {
            return;
        }

        tail.position = new Position(tail.position.rowIndex() - 1, position.columnIndex());
    }

    void dragDown(Knot tail) {
        position = position.incrementRowIndex();

        if (isTouching(tail)) {
            return;
        }

        tail.position = new Position(tail.position.rowIndex() + 1, position.columnIndex());
    }

    void dragLeft(Knot tail) {
        position = position.decrementColumnIndex();

        if (isTouching(tail)) {
            return;
        }

        tail.position = new Position(position.rowIndex(), tail.position.columnIndex() - 1);
    }

    void dragRight(Knot tail) {
        position = position.incrementColumnIndex();

        if (isTouching(tail)) {
            return;
        }

        tail.position = new Position(position.rowIndex(), tail.position.columnIndex() + 1);
    }

    private boolean isTouching(Knot tail) {
        return Math.abs(position.rowIndex() - tail.position.rowIndex()) < 2
                && Math.abs(position.columnIndex() - tail.position.columnIndex()) < 2;
    }
}

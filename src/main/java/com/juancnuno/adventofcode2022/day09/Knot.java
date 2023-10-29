package com.juancnuno.adventofcode2022.day09;

public final class Knot {
    private Position position;

    Knot() {
        this(new Position());
    }

    public Knot(Position position) {
        this.position = position;
    }

    boolean isTouching(Knot knot) {
        return Math.abs(position.rowIndex() - knot.position.rowIndex()) < 2
                && Math.abs(position.columnIndex() - knot.position.columnIndex()) < 2;
    }

    public void keepUpWith(Knot knot) {
        var rowIndex = position.rowIndex();
        var knotRowIndex = knot.position.rowIndex();
        var columnIndex = position.columnIndex();
        var knotColumnIndex = knot.position.columnIndex();

        if (rowIndex == knotRowIndex) {
            if (columnIndex < knotColumnIndex) {
                moveRight();
            } else {
                moveLeft();
            }
        } else if (columnIndex == knotColumnIndex) {
            if (rowIndex < knotRowIndex) {
                moveDown();
            } else {
                moveUp();
            }
        } else if (rowIndex < knotRowIndex) {
            if (columnIndex < knotColumnIndex) {
                position = new Position(rowIndex + 1, columnIndex + 1);
            } else {
                position = new Position(rowIndex + 1, columnIndex - 1);
            }
        } else {
            if (columnIndex < knotColumnIndex) {
                position = new Position(rowIndex - 1, columnIndex + 1);
            } else {
                position = new Position(rowIndex - 1, columnIndex - 1);
            }
        }
    }

    void moveUp() {
        position = position.decrementRowIndex();
    }

    void moveDown() {
        position = position.incrementRowIndex();
    }

    void moveLeft() {
        position = position.decrementColumnIndex();
    }

    void moveRight() {
        position = position.incrementColumnIndex();
    }

    public Position getPosition() {
        return position;
    }
}

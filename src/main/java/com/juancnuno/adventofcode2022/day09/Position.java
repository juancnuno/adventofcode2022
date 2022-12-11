package com.juancnuno.adventofcode2022.day09;

record Position(int rowIndex, int columnIndex) {
    Position() {
        this(0, 0);
    }

    Position decrementRowIndex() {
        return new Position(rowIndex - 1, columnIndex);
    }

    Position incrementRowIndex() {
        return new Position(rowIndex + 1, columnIndex);
    }

    Position decrementColumnIndex() {
        return new Position(rowIndex, columnIndex - 1);
    }

    Position incrementColumnIndex() {
        return new Position(rowIndex, columnIndex + 1);
    }
}

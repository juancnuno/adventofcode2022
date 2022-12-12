package com.juancnuno.adventofcode2022.day10;

final class Sprite {
    private int position;

    void setPosition(int position) {
        // The minimum position is -1? I expect it to be 1.
        assert -1 <= position && position <= 39 : position;

        this.position = position;
    }

    boolean contains(int columnIndex) {
        assert 0 <= columnIndex && columnIndex <= 40;
        return position - 1 <= columnIndex && columnIndex <= position + 1;
    }
}

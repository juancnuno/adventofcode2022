package com.juancnuno.adventofcode2022.day02;

public enum YourPlay {
    /**
     * Rock
     */
    X(1),

    /**
     * Paper
     */
    Y(2),

    /**
     * Scissor
     */
    Z(3);

    private final int score;

    YourPlay(int score) {
        this.score = score;
    }

    final int getScore() {
        return score;
    }
}

package com.juancnuno.adventofcode2022.day02;

// A Rock
// B Paper
// C Scissors

// X Rock
// Y Paper
// Z Scissors

enum Outcome2 {
    /**
     * Loss
     */
    X(0) {
        @Override
        YourPlay getYourPlay(OpponentsPlay play) {
            return switch (play) {
                case A -> YourPlay.Z;
                case B -> YourPlay.X;
                case C -> YourPlay.Y;
            };
        }
    },

    /**
     * Draw
     */
    Y(3) {
        @Override
        YourPlay getYourPlay(OpponentsPlay play) {
            return switch (play) {
                case A -> YourPlay.X;
                case B -> YourPlay.Y;
                case C -> YourPlay.Z;
            };
        }
    },

    /**
     * Win
     */
    Z(6) {
        @Override
        YourPlay getYourPlay(OpponentsPlay play) {
            return switch (play) {
                case A -> YourPlay.Y;
                case B -> YourPlay.Z;
                case C -> YourPlay.X;
            };
        }
    };

    private final int score;

    Outcome2(int score) {
        this.score = score;
    }

    abstract YourPlay getYourPlay(OpponentsPlay play);

    final int getScore() {
        return score;
    }
}

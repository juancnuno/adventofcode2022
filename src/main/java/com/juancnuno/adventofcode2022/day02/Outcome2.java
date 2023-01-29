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
    @SuppressWarnings("unused")
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
    @SuppressWarnings("unused")
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
    @SuppressWarnings("unused")
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

    @SuppressWarnings("unused")
    Outcome2(int score) {
        this.score = score;
    }

    abstract YourPlay getYourPlay(OpponentsPlay play);

    final int getScore() {
        return score;
    }
}

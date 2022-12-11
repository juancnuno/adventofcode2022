package com.juancnuno.adventofcode2022.day02;

enum Outcome {
    LOSS(0), DRAW(3), WIN(6);

    private final int score;

    Outcome(int score) {
        this.score = score;
    }

    static Outcome get(OpponentsPlay opponentsPlay, YourPlay yourPlay) {
        return switch (opponentsPlay) {
            case A -> // rock
                    switch (yourPlay) {
                        case X -> Outcome.DRAW; // rock
                        case Y -> Outcome.WIN; // paper
                        case Z -> Outcome.LOSS; // scissor
                    };
            case B -> // paper
                    switch (yourPlay) {
                        case X -> Outcome.LOSS; // rock
                        case Y -> Outcome.DRAW; // paper
                        case Z -> Outcome.WIN; // scissor
                    };
            case C -> // scissor
                    switch (yourPlay) {
                        case X -> Outcome.WIN; // rock
                        case Y -> Outcome.LOSS; // paper
                        case Z -> Outcome.DRAW; // scissor
                    };
        };
    }

    final int getScore() {
        return score;
    }
}

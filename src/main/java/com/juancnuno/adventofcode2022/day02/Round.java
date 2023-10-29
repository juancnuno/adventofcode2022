package com.juancnuno.adventofcode2022.day02;

public final class Round {
    private final OpponentsPlay opponentsPlay;
    private final YourPlay yourPlay;

    public Round(String line) {
        opponentsPlay = OpponentsPlay.valueOf(line.substring(0, 1));
        yourPlay = YourPlay.valueOf(line.substring(2, 3));
    }

    int getScore() {
        return yourPlay.getScore() + Outcome.get(opponentsPlay, yourPlay).getScore();
    }

    public Object getOpponentsPlay() {
        return opponentsPlay;
    }

    public Object getYourPlay() {
        return yourPlay;
    }
}

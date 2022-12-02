package adventofcode2022.day2;

final class Round {
    private final OpponentsPlay opponentsPlay;
    private final YourPlay yourPlay;

    Round(String line) {
        opponentsPlay = OpponentsPlay.valueOf(line.substring(0, 1));
        yourPlay = YourPlay.valueOf(line.substring(2, 3));
    }

    int getScore() {
        return yourPlay.getScore() + Outcome.get(opponentsPlay, yourPlay).getScore();
    }

    Object getOpponentsPlay() {
        return opponentsPlay;
    }

    Object getYourPlay() {
        return yourPlay;
    }
}

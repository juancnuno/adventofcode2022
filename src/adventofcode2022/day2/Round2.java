package adventofcode2022.day2;

final class Round2 {
    private final OpponentsPlay opponentsPlay;
    private final Outcome2 outcome;

    Round2(String line) {
        opponentsPlay = OpponentsPlay.valueOf(line.substring(0, 1));
        outcome = Outcome2.valueOf(line.substring(2, 3));
    }

    int getScore() {
        return outcome.getYourPlay(opponentsPlay).getScore() + outcome.getScore();
    }
}

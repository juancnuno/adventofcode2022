package adventofcode2022.day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

final class Part1 {
    private Part1() {
    }

    public static void main(String[] args) throws IOException {
        Stacks stacks = new Stacks(9);

        // noinspection SpellCheckingInspection
        stacks.add(0, "HRBDZFLS");

        // noinspection SpellCheckingInspection
        stacks.add(1, "TBMZR");

        // noinspection SpellCheckingInspection
        stacks.add(2, "ZLCHNS");

        // noinspection SpellCheckingInspection
        stacks.add(3, "SCFJ");

        // noinspection SpellCheckingInspection
        stacks.add(4, "PGHWRZB");

        // noinspection SpellCheckingInspection
        stacks.add(5, "VJZGDNMT");

        // noinspection SpellCheckingInspection
        stacks.add(6, "GLNWFSPQ");

        stacks.add(7, "MZR");

        // noinspection SpellCheckingInspection
        stacks.add(8, "MCLGVRT");

        try (var lines = Files.lines(Path.of(args[0]))) {
            lines
                    .map(Step::new)
                    .forEach(step -> step.moveCrates(stacks));
        }

        System.out.println(stacks.getTopCrates());
    }
}

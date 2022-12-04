package adventofcode2022.day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

final class Part2 {
    private final Stream<String> pairs;

    Part2(Stream<String> pairs) {
        this.pairs = pairs;
    }

    int getCount() {
        return (int) pairs
                .map(RangePair::new)
                .filter(pair -> pair.getRange1().overlaps(pair.getRange2()))
                .count();
    }

    public static void main(String[] args) throws IOException {
        try (var lines = Files.lines(Path.of(args[0]))) {
            System.out.println(new Part2(lines).getCount());
        }
    }
}

package com.juancnuno.adventofcode2022.day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Predicate;
import java.util.stream.Collectors;

final class Part2 {
    private final String packets;

    Part2(String packets) {
        this.packets = packets;
    }

    int getDecoderKey() {
        var packets = this.packets.lines()
                .filter(Predicate.not(CharSequence::isEmpty))
                .map(Element::parse)
                .collect(Collectors.toList());

        var divider1 = Element.parse("[[2]]");
        packets.add(divider1);

        var divider2 = Element.parse("[[6]]");
        packets.add(divider2);

        packets.sort(null);
        return (packets.indexOf(divider1) + 1) * (packets.indexOf(divider2) + 1);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Part2(Files.readString(Path.of(args[0]))).getDecoderKey());
    }
}

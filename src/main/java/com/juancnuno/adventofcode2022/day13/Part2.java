package com.juancnuno.adventofcode2022.day13;

import com.juancnuno.adventofcode2022.AdventOfCode;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class Part2 {
    private final String packets;

    public Part2(String packets) {
        this.packets = packets;
    }

    public int getDecoderKey() {
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

    public static void main(String[] args) {
        AdventOfCode.printResultString(packets -> new Part2(packets).getDecoderKey());
    }
}

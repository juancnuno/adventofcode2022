package com.juancnuno.adventofcode2022.day13;

public interface Element extends Comparable<Element> {
    static Element parse(CharSequence element) {
        return new ElementParser().parse(element);
    }
}

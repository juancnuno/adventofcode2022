package com.juancnuno.adventofcode2022.day13;

interface Element extends Comparable<Element> {
    static Element parse(CharSequence element) {
        return new ElementParser().parse(element);
    }
}

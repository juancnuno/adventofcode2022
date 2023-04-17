package com.juancnuno.adventofcode2022.day13;

abstract class Element implements Comparable<Element> {
    static Element parse(CharSequence element) {
        return new ElementParser().parse(element);
    }
}

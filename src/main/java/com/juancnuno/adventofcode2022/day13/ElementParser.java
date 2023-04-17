package com.juancnuno.adventofcode2022.day13;

import java.util.ArrayDeque;
import java.util.Deque;

final class ElementParser {
    private char c;
    private boolean nextCharDigit;
    private Element element;
    private final Deque<List.Builder> listBuilders = new ArrayDeque<>();
    private Integer.Builder integerBuilder;

    Element parse(CharSequence element) {
        for (int i = 0, length = element.length(); i < length; i++) {
            c = element.charAt(i);
            nextCharDigit = i + 1 < length && Character.isDigit(element.charAt(i + 1));

            handleChar();
        }

        return this.element;
    }

    private void handleChar() {
        switch (c) {
            case '[' -> handleLeftBracket();
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> handleDigit();
            case ',' -> {
            }
            case ']' -> handleRightBracket();
            default -> {
                assert false : c;
            }
        }
    }

    private void handleLeftBracket() {
        listBuilders.push(new List.Builder());
    }

    private void handleDigit() {
        if (integerBuilder == null) {
            integerBuilder = new Integer.Builder();
        }

        integerBuilder.add(c);

        if (nextCharDigit) {
            return;
        }

        var builder = listBuilders.peek();
        assert builder != null;

        builder.add(integerBuilder.build());
        integerBuilder = null;
    }

    private void handleRightBracket() {
        var list = listBuilders.pop().build();
        var builder = listBuilders.peek();

        if (builder == null) {
            element = list;
        } else {
            builder.add(list);
        }
    }
}

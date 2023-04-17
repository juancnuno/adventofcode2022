package com.juancnuno.adventofcode2022.day13;

final class Integer extends Element {
    private final int value;

    static final class Builder {
        private final StringBuilder builder = new StringBuilder();

        void add(char digit) {
            builder.append(digit);
        }

        Element build() {
            return new Integer(this);
        }
    }

    private Integer(Builder builder) {
        value = java.lang.Integer.parseInt(builder.builder, 0, builder.builder.length(), 10);
    }

    @Override
    public String toString() {
        return java.lang.Integer.toString(value);
    }

    @Override
    public int compareTo(Element element) {
        if (element instanceof Integer integer) {
            return java.lang.Integer.compare(value, integer.value);
        }

        return new List(this).compareTo(element);
    }
}

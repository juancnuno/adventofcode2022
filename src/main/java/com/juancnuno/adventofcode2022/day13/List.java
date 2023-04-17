package com.juancnuno.adventofcode2022.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

final class List extends Element {
    private final Collection<Element> elements;

    static final class Builder {
        private final Collection<Element> elements = new ArrayList<>();

        void add(Element element) {
            elements.add(element);
        }

        Element build() {
            return new List(this);
        }
    }

    private List(Builder builder) {
        elements = builder.elements;
    }

    List(Integer integer) {
        elements = java.util.List.of(integer);
    }

    @Override
    public String toString() {
        return elements.stream()
                .map(Object::toString)
                .collect(Collectors.joining(",", "[", "]"));
    }

    @Override
    public int compareTo(Element element) {
        if (element instanceof List list) {
            var iterator = elements.iterator();
            var listIterator = list.elements.iterator();

            while (iterator.hasNext() && listIterator.hasNext()) {
                var result = iterator.next().compareTo(listIterator.next());

                if (result != 0) {
                    return result;
                }
            }

            return java.lang.Integer.compare(elements.size(), list.elements.size());
        }

        return compareTo(new List((Integer) element));
    }
}

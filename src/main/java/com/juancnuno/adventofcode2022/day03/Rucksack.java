package com.juancnuno.adventofcode2022.day03;

import java.util.Collection;
import java.util.stream.Collectors;

public final class Rucksack {
    private final String items;

    public Rucksack(String items) {
        this.items = items;
    }

    public Item getItemInBothCompartments() {
        var length = items.length() / 2;
        return findFirstItem(toSet(items.substring(length)), toSet(items.substring(0, length)));
    }

    static Item findFirstItem(Collection<Character> collection1, Collection<Character> collection2) {
        var item = collection1.stream()
                .filter(collection2::contains)
                .map(Item::new)
                .findFirst();

        return item.orElseThrow();
    }

    Collection<Character> getItemSet() {
        return toSet(items);
    }

    private static Collection<Character> toSet(CharSequence items) {
        return items.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
    }
}

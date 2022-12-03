package adventofcode2022.day3;

import java.util.stream.Collectors;

final class Rucksack {
    private final String items;

    Rucksack(String items) {
        this.items = items;
    }

    Item getItemInBothCompartments() {
        var length = items.length() / 2;
        var itemsInFirstCompartment = items.substring(0, length);
        var itemsInSecondCompartment = items.substring(length);

        var characters = itemsInFirstCompartment.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        for (var i = 0; i < length; i++) {
            var c = itemsInSecondCompartment.charAt(i);

            if (characters.contains(c)) {
                return new Item(c);
            }
        }

        throw new AssertionError();
    }
}

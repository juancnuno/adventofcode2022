package adventofcode2022.day3;

import java.util.stream.Stream;

final class Group {
    private final Stream<String> items;

    Group(Stream<String> items) {
        this.items = items;
    }

    Item getItemInAllRucksacks() {
        var i = items
                .map(Rucksack::new)
                .iterator();

        var rucksack1 = i.next();
        var rucksack2 = i.next();
        var rucksack3 = i.next();

        var set = rucksack1.getItemSet();
        set.retainAll(rucksack2.getItemSet());

        return Rucksack.findFirstItem(rucksack3.getItemSet(), set);
    }
}

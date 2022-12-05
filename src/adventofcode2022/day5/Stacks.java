package adventofcode2022.day5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Stacks {
    private final List<Deque<Character>> stacks;

    Stacks(int count) {
        stacks = new ArrayList<>(count);

        IntStream.range(0, count)
                .mapToObj(index -> new ArrayDeque<Character>())
                .forEach(stacks::add);
    }

    void add(int index, CharSequence crates) {
        Deque<Character> stack = stacks.get(index);

        crates.chars()
                .mapToObj(crate -> (char) crate)
                .forEach(stack::addLast);
    }

    void move(int fromIndex, int toIndex) {
        char crate = stacks.get(fromIndex).removeLast();
        stacks.get(toIndex).addLast(crate);
    }

    Object getTopCrates() {
        return stacks.stream()
                .map(Deque::getLast)
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}

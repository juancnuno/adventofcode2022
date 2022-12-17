package com.juancnuno.adventofcode2022.day11;

import java.util.function.IntPredicate;

record IsDivisibleBy(int divisor) implements IntPredicate {
    @Override
    public boolean test(int dividend) {
        return dividend % divisor == 0;
    }
}

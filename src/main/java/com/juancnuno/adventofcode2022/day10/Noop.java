package com.juancnuno.adventofcode2022.day10;

import java.util.Optional;

final class Noop extends Instruction {
    private Noop() {
        super(1);
    }

    static Optional<Instruction> parseNoop(CharSequence instruction) {
        if (!instruction.equals("noop")) {
            return Optional.empty();
        }

        return Optional.of(new Noop());
    }

    @Override
    void finish(Cpu cpu) {
    }
}

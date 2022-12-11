package com.juancnuno.adventofcode2022.day10;

abstract class Instruction {
    private final int duration;
    private int cycle;

    Instruction(int duration) {
        this.duration = duration;
    }

    static Instruction parseInstruction(CharSequence instruction) {
        return Addx.parseAddx(instruction).or(() -> Noop.parseNoop(instruction))
                .orElseThrow(() -> new AssertionError(instruction));
    }

    final boolean hasBegun() {
        return cycle != 0;
    }

    final void begin(int cycle) {
        this.cycle = cycle;
    }

    final boolean isDone(int cycle) {
        return cycle - this.cycle == duration;
    }

    abstract void finish(Cpu cpu);
}

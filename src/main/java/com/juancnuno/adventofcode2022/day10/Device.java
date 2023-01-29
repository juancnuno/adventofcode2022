package com.juancnuno.adventofcode2022.day10;

import java.util.Iterator;
import java.util.stream.Stream;

final class Device {
    private final Crt crt;
    private final Cpu cpu;
    private final Iterator<Instruction> instructions;

    private Instruction current;
    private int cycle;
    private int sum;

    Device(Stream<String> instructions) {
        cpu = new Cpu();
        crt = new Crt();

        this.instructions = instructions
                .map(Instruction::parseInstruction)
                .iterator();

        current = this.instructions.next();
    }

    void runProgram() {
        while (current != null) {
            tick();
        }
    }

    void tick() {
        cycle++;

        if (current == null) {
            return;
        }

        if (!current.hasBegun()) {
            current.begin(cycle);
        }

        addInterestingSignalStrengths();
        crt.draw(cpu);

        if (current.isDone(cycle)) {
            current.finish(cpu);

            if (instructions.hasNext()) {
                current = instructions.next();
            } else {
                current = null;
            }
        }
    }

    private void addInterestingSignalStrengths() {
        switch (cycle) {
            case 20, 60, 100, 140, 180, 220 -> sum += cycle * cpu.getX();
        }
    }

    Object getCrt() {
        return crt;
    }

    Cpu getCpu() {
        return cpu;
    }

    int getSignalStrengthSum() {
        return sum;
    }
}

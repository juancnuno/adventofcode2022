package com.juancnuno.adventofcode2022.day10;

import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

final class Device {
    private final Cpu cpu;
    private final Iterator<Instruction> instructions;

    private Instruction current;
    private int cycle;

    Device(Stream<String> instructions) {
        cpu = new Cpu();

        this.instructions = instructions
                .map(Instruction::parseInstruction)
                .iterator();

        current = this.instructions.next();
    }

    int getSignalStrengthSum() {
        var sum = 0;

        tickNTimes(20);
        sum += getSignalStrength();

        for (var i = 0; i < 5; i++) {
            tickNTimes(40);
            sum += getSignalStrength();
        }

        return sum;
    }

    private void tickNTimes(int n) {
        IntStream.range(0, n).forEach(i -> tick());
    }

    void tick() {
        if (current != null && !current.hasBegun()) {
            current.begin(cycle);
        }

        cycle++;

        if (current != null && current.isDone(cycle)) {
            current.finish(cpu);

            if (instructions.hasNext()) {
                current = instructions.next();
            } else {
                current = null;
            }
        }
    }

    private int getSignalStrength() {
        return cycle * cpu.getX();
    }

    Cpu getCpu() {
        return cpu;
    }
}

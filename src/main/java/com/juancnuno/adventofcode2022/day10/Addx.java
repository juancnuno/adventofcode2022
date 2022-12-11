package com.juancnuno.adventofcode2022.day10;

import java.util.Optional;
import java.util.regex.Pattern;

final class Addx extends Instruction {
    private static final Pattern PATTERN = Pattern.compile("addx (-?\\d+)");
    private final int value;

    private Addx(int value) {
        super(2);
        this.value = value;
    }

    static Optional<Instruction> parseAddx(CharSequence instruction) {
        var matcher = PATTERN.matcher(instruction);

        if (!matcher.matches()) {
            return Optional.empty();
        }

        return Optional.of(new Addx(Integer.parseInt(matcher.group(1))));
    }

    @Override
    void finish(Cpu cpu) {
        cpu.setX(cpu.getX() + value);
    }
}

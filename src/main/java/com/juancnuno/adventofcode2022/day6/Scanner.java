package com.juancnuno.adventofcode2022.day6;

final class Scanner {
    private final CharSequence buffer;

    Scanner(CharSequence buffer) {
        this.buffer = buffer;
    }

    int getStartOfPacketMarkerPosition() {
        for (int i = 0, length = buffer.length(); i + 4 <= length; i++) {
            if (areAllCharactersDifferent(buffer.subSequence(i, i + 4))) {
                return i + 4;
            }
        }

        throw new AssertionError(buffer);
    }

    private static boolean areAllCharactersDifferent(CharSequence subbuffer) {
        assert subbuffer.length() == 4;

        var count = subbuffer.chars()
                .distinct()
                .count();

        return count == 4;
    }
}

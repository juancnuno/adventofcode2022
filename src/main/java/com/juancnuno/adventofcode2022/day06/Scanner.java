package com.juancnuno.adventofcode2022.day06;

final class Scanner {
    private final CharSequence buffer;

    Scanner(CharSequence buffer) {
        this.buffer = buffer;
    }

    int getStartOfPacketMarkerPosition() {
        return getMarkerPosition(4);
    }

    int getStartOfMessageMarkerPosition() {
        return getMarkerPosition(14);
    }

    private int getMarkerPosition(int markerLength) {
        for (int i = 0, bufferLength = buffer.length(); i + markerLength <= bufferLength; i++) {
            if (areAllCharactersDifferent(buffer.subSequence(i, i + markerLength), markerLength)) {
                return i + markerLength;
            }
        }

        throw new AssertionError(buffer);
    }

    private static boolean areAllCharactersDifferent(CharSequence subbuffer, int markerLength) {
        assert subbuffer.length() == markerLength;

        var count = subbuffer.chars()
                .distinct()
                .count();

        return count == markerLength;
    }
}

package com.juancnuno.adventofcode2022.day06;

public final class Scanner {
    private final CharSequence buffer;

    public Scanner(CharSequence buffer) {
        this.buffer = buffer;
    }

    public int getStartOfPacketMarkerPosition() {
        return getMarkerPosition(4);
    }

    public int getStartOfMessageMarkerPosition() {
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

    private static boolean areAllCharactersDifferent(CharSequence subBuffer, int markerLength) {
        assert subBuffer.length() == markerLength;

        var count = subBuffer.chars()
                .distinct()
                .count();

        return count == markerLength;
    }
}

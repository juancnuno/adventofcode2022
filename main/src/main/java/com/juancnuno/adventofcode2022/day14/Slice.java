package com.juancnuno.adventofcode2022.day14;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Slice {
    private static final Point SOURCE = new Point(500, 0);
    private final Collection<Point> points;

    public Slice(String paths) {
        points = new HashSet<>();
        Arrays.stream(paths.split("\n")).forEach(this::add);
    }

    private void add(String path) {
        var points = Arrays.stream(path.split(" -> "))
                .map(Point::parse)
                .toList();

        var previousPoint = points.get(0);

        for (var point : points.subList(1, points.size())) {
            this.points.addAll(points(previousPoint, point).toList());
            previousPoint = point;
        }
    }

    private static Stream<Point> points(Point start, Point end) {
        var startX = start.x();
        var endX = end.x();
        var startY = start.y();
        var endY = end.y();

        assert startX == endX || startY == endY;

        if (startX == endX) {
            return IntStream.rangeClosed(Math.min(startY, endY), Math.max(startY, endY))
                    .mapToObj(y -> new Point(startX, y));
        }

        return IntStream.rangeClosed(Math.min(startX, endX), Math.max(startX, endX))
                .mapToObj(x -> new Point(x, startY));
    }

    @Override
    public String toString() {
        var yStatistics = IntStream.concat(IntStream.of(SOURCE.y()), points.stream().mapToInt(Point::y))
                .summaryStatistics();

        var xStatistics = IntStream.concat(IntStream.of(SOURCE.x()), points.stream().mapToInt(Point::x))
                .summaryStatistics();

        return IntStream.rangeClosed(yStatistics.getMin(), yStatistics.getMax())
                .mapToObj(y -> toString(xStatistics, y))
                .collect(Collectors.joining());
    }

    private String toString(IntSummaryStatistics statistics, int y) {
        return IntStream.rangeClosed(statistics.getMin(), statistics.getMax())
                .mapToObj(x -> new Point(x, y))
                .map(this::toString)
                .collect(Collectors.joining("", "", System.lineSeparator()));
    }

    private String toString(Point point) {
        if (point.equals(SOURCE)) {
            return "+";
        }

        if (points.contains(point)) {
            return "#";
        }

        return ".";
    }
}

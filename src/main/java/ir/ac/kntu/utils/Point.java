package ir.ac.kntu.utils;

import java.util.Objects;

public class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(String x, String y) {
        try {
            this.x = Integer.parseInt(x.trim());
            this.y = Integer.parseInt(y.trim());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Point[x: " + x + ", y: " + y + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

package ir.ac.kntu;

import java.util.*;

import ir.ac.kntu.utils.*;

public class ConvexHull {
    public int pointsOrientation(Point p1, Point p2, Point p3) {
        int subValue = (p2.y - p1.y) * (p3.x - p2.x) - (p2.x - p1.x) * (p3.y - p2.y);

        if (subValue == 0) return 0;
        else if (subValue > 0) return 1;
        else return 2;
    }

    public Vector<Point> convexHull(Point[] points, int n) {
        if (n < 3) return null;
        Vector<Point> hull = new Vector<>();
        int l = 0;
        for (int i = 1; i < n; i++)
            if (points[i].x < points[l].x) l = i;
        int p = l, q;
        do {
            hull.add(points[p]);
            q = (p + 1) % n;

            for (int i = 0; i < n; i++) {
                if (pointsOrientation(points[p], points[i], points[q]) == 2) q = i;
            }

            p = q;

        } while (p != l);

        return hull;
    }

    public Point[] convertStringToPoints(String inputString) {
        String[] inputArray = inputString.split(",");
        int pointsLength = inputArray.length;
        Point[] points = new Point[pointsLength / 2];

        for (int i = 0; i < pointsLength; i += 2) {
            String input = inputArray[i] + "," + inputArray[i + 1];
            input = input.replace("(", "");
            input = input.replace(")", "");
            points[i / 2] = new Point(input.split(",")[0], input.split(",")[1]);
        }

        return points;
    }
}
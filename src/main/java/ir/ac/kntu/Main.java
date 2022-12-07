package ir.ac.kntu;

import ir.ac.kntu.utils.Point;
import ir.ac.kntu.utils.ScannerWrapper;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ConvexHull convexHull = new ConvexHull();
        System.out.println("..:: Convex Hull ::..");
        System.out.print("+ Enter input: ");

        ScannerWrapper.setInputStream(System.in);
        String input = ScannerWrapper.readLine();

        Point[] points = convexHull.convertStringToPoints(input);

        System.out.println("+ Result: ");
        Vector<Point> hull = convexHull.convexHull(points, points.length);
        if (hull != null)
            for (Point temp : hull)
                System.out.println("\t(" + temp.x + ", " + temp.y + ")");
    }
}

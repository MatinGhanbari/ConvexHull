package ir.ac.kntu.style;

import ir.ac.kntu.*;
import ir.ac.kntu.utils.Point;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.*;

import static org.junit.Assert.*;

public class SolutionTest {

    private ConvexHull convexHull;
    private ArrayList<String> inputs;
    private ArrayList<ArrayList<Point>> answers;

    @Before
    public void setUp() throws Exception {
        convexHull = new ConvexHull();
        inputs = new ArrayList<>();
        answers = new ArrayList<>();

        // INPUT #0
        inputs.add("(0,3), (2,2), (1,1), (2,1), (3,0), (0,0), (3,3)");
        answers.add(new ArrayList<>());
        answers.get(0).add(new Point(0, 3));
        answers.get(0).add(new Point(0, 0));
        answers.get(0).add(new Point(3, 0));
        answers.get(0).add(new Point(3, 3));
        // INPUT #1
        inputs.add("(0, 0), (0, 4), (-4, 0), (5, 0), (0, -6), (1, 0)");
        answers.add(new ArrayList<>());
        answers.get(1).add(new Point(-4, 0));
        answers.get(1).add(new Point(0, -6));
        answers.get(1).add(new Point(5, 0));
        answers.get(1).add(new Point(0, 4));
        // INPUT #2
        inputs.add("(0, 0), (1, 2), (2, 2), (0, -1), (1, 0)");
        answers.add(new ArrayList<>());
        answers.get(2).add(new Point(0, 0));
        answers.get(2).add(new Point(0, -1));
        answers.get(2).add(new Point(1, 0));
        answers.get(2).add(new Point(2, 2));
        answers.get(2).add(new Point(1, 2));
        // INPUT #3
        inputs.add("(0, 0), (6, 2), (2, 10), (1, -10)");
        answers.add(new ArrayList<>());
        answers.get(3).add(new Point(0, 0));
        answers.get(3).add(new Point(1, -10));
        answers.get(3).add(new Point(6, 2));
        answers.get(3).add(new Point(2, 10));
        // INPUT #4
        inputs.add("(0, 1), (1, 0), (3, 2), (2, 3), (4, 2), (4, 3), (10, 10)");
        answers.add(new ArrayList<>());
        answers.get(4).add(new Point(0, 1));
        answers.get(4).add(new Point(1, 0));
        answers.get(4).add(new Point(4, 2));
        answers.get(4).add(new Point(10, 10));
        answers.get(4).add(new Point(2, 3));
    }

    @Test
    public void test0() {
        String input = inputs.get(0);
        ArrayList<Point> answer = answers.get(0);
        Point[] points = convexHull.convertStringToPoints(input);
        Vector<Point> hull = convexHull.convexHull(points, points.length);

        assertEquals(hull, answer);
    }

    @Test
    public void test1() {
        String input = inputs.get(1);
        ArrayList<Point> answer = answers.get(1);
        Point[] points = convexHull.convertStringToPoints(input);
        Vector<Point> hull = convexHull.convexHull(points, points.length);

        assertEquals(hull, answer);
    }

    @Test
    public void test2() {
        String input = inputs.get(2);
        ArrayList<Point> answer = answers.get(2);
        Point[] points = convexHull.convertStringToPoints(input);
        Vector<Point> hull = convexHull.convexHull(points, points.length);

        assertEquals(hull, answer);
    }

    @Test
    public void test3() {
        String input = inputs.get(3);
        ArrayList<Point> answer = answers.get(3);
        Point[] points = convexHull.convertStringToPoints(input);
        Vector<Point> hull = convexHull.convexHull(points, points.length);

        assertEquals(hull, answer);
    }

    @Test
    public void test4() {
        String input = inputs.get(4);
        ArrayList<Point> answer = answers.get(4);
        Point[] points = convexHull.convertStringToPoints(input);
        Vector<Point> hull = convexHull.convexHull(points, points.length);

        assertEquals(hull, answer);
    }
}
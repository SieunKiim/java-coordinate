package calculator.logic;

import java.util.List;
import point.Point;

public class TriangleLogic implements CalculateLogic {

    @Override
    public Double calculate(List<Point> points) {
        Point A = points.get(0);
        Point B = points.get(1);
        Point C = points.get(2);
        Double a = getLineDistance(A, B);
        Double b = getLineDistance(B, C);
        Double c = getLineDistance(A, C);

        return Math.sqrt(4 * square(a) * square(b) - square(square(a) + square(b) - square(c))) / 4;
    }

    private Double square(Double d) {
        return Math.pow(d,2);
    }

    private Double getLineDistance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

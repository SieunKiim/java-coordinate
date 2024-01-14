package calculator.logic;

import calculator.logic.CalculateLogic;
import java.util.List;
import point.Point;

public class LineLogic implements CalculateLogic {

    @Override
    public Double calculate(List<Point> points) {
        Point a = points.get(0);
        Point b = points.get(1);
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

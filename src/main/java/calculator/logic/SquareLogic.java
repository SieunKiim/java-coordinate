package calculator.logic;

import calculator.logic.CalculateLogic;
import java.util.List;
import point.Point;

public class SquareLogic implements CalculateLogic {

    @Override
    public Double calculate(List<Point> points) {
        int hx = Integer.MIN_VALUE, hy = Integer.MIN_VALUE;
        int lx = Integer.MAX_VALUE, ly = Integer.MAX_VALUE;
        for (Point point : points) {
            hx = Math.max(hx, point.getX());
            hy = Math.max(hy, point.getY());
            lx = Math.min(lx, point.getX());
            ly = Math.min(ly, point.getY());
        }
        return (double) ((hx - lx) * (hy - ly));
    }
}

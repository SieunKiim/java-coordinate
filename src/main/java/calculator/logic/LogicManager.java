package calculator.logic;

import java.util.List;
import point.Point;

public class LogicManager {

    public static final int SQUARE_POINT = 4;
    public static final int TRIANGLE_POINT = 3;

    public static CalculateLogic getLogic(List<Point> points) {
        int pointsSize = points.size();
        if (pointsSize == SQUARE_POINT) {
            return new SquareLogic();
        }
        if (pointsSize == TRIANGLE_POINT) {
            return new TriangleLogic();
        }
        return new LineLogic();
    }

}

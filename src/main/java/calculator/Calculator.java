package calculator;

import calculator.logic.CalculateLogic;
import calculator.logic.LogicManager;
import input.Input;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import output.Output;
import point.Point;

public class Calculator {

    public static final String REGEX = "-";
    private final Input input = new Input() {};
    private final Output output = new Output() {};


    public List<Point> getPoints(String raw) {
        String[] split = raw.split(REGEX);
        return Arrays.stream(split).map(Point::new).collect(Collectors.toList());
    }

    public Double calculate(List<Point> points) {
        CalculateLogic logic = LogicManager.getLogic(points);
        return logic.calculate(points);
    }

}

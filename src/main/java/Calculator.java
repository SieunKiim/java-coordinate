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

    public Double getDistance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}

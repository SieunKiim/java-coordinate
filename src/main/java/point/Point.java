package point;

import java.util.List;
import point.format.BracketCommaFormat;
import point.format.PointFormat;

public class Point {

    public static final PointFormat FORMAT = new BracketCommaFormat();
    private static final int LIMIT = 25;
    public static final int X_POSITION = 0;
    public static final int Y_POSITION = 1;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        validate(x);
        validate(y);
        this.x = x;
        this.y = y;
    }

    public Point(String stringBeforeParse) {
        List<Integer> parse = FORMAT.parse(stringBeforeParse);
        this.x = parse.get(X_POSITION);
        this.y = parse.get(Y_POSITION);
    }

    public void validate(int n) {
        if (n >= LIMIT) {
            throw new IllegalArgumentException();
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}

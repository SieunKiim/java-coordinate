package point.format;

import java.util.List;
import point.Point;

public interface PointFormat {

    List<Integer> parse(String s);
}

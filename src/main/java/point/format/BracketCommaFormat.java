package point.format;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import point.Point;

public class BracketCommaFormat implements PointFormat{

    @Override
    public List<Integer> parse(String s) {
        String substring = s.substring(1, s.length() - 1);
        return Arrays.stream(substring.split(",")).map(Integer::parseInt).collect(Collectors.toList());
    }
}

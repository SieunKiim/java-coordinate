import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import java.util.List;
import org.junit.jupiter.api.Test;
import point.Point;

public class CalculatorTest {

    @Test
    void 계산기_생성() {
        Calculator cal = new Calculator();
        assertThat(cal).isNotNull();
    }

    @Test
    void 점_샤이_거리_계산(){
        Calculator cal = new Calculator();
        List<Point> points = cal.getPoints("(10,10)-(14,15)");
        Double distance = cal.getDistance(points.get(0), points.get(1));
        assertThat(distance).isEqualTo(6.403124, offset(0.00099));
    }

}

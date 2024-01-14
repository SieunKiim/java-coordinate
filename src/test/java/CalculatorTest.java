import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import calculator.Calculator;
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
    void 점_사이_거리_계산(){
        Calculator cal = new Calculator();
        List<Point> points = cal.getPoints("(10,10)-(14,15)");
        Double distance = cal.calculate(points);
        assertThat(distance).isEqualTo(6.403124, offset(0.00099));
    }


    @Test
    void 사각형_넓이_계산(){
        Calculator cal = new Calculator();
        List<Point> points = cal.getPoints("(10,10)-(22,10)-(22,18)-(10,18)");
        Double distance = cal.calculate(points);
        assertThat(distance).isEqualTo(96);
    }

    @Test
    void 삼각형_넓이_계산(){
        Calculator cal = new Calculator();
        List<Point> points = cal.getPoints("(10,10)-(14,15)-(20,8)");
        Double distance = cal.calculate(points);
        assertThat(distance).isEqualTo(29.0);
    }

}

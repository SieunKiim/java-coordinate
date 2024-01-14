import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import point.Point;

public class PointTest {

    @Test
    void 좌표_생성(){
        Point point = new Point(1,2);
        assertThat(point).isNotNull();
    }

    @Test
    void 좌표_생성_실패(){
        assertThrows(IllegalArgumentException.class, () -> new Point(26, 1));
    }
}

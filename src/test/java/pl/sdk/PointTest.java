package pl.sdk;

import org.junit.jupiter.api.Test;
import pl.sdk.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PointTest {

    @Test
    void example() {
        // given
        Point point = new Point(1, 5);
        // when
        int x = point.getX();
        // then
        assertEquals(1, x);
    }

    @Test
    void distanceShouldBeSever() {

        //given
        Point point = new Point(0, 7);
        //when
        double result = point.getDistanceToCenter();
        //then
        assertEquals(7.0, result);
    }
}

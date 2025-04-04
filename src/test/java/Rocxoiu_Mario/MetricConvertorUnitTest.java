package Rocxoiu_Mario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetricConvertorUnitTest {

    @Test
    void testSimpleAddition() {
        assertEquals(2000, MetricConvertor.evaluateExpression("1m + 100cm", "mm"));
    }

    @Test
    void testSimpleSubtraction() {
        assertEquals(900, MetricConvertor.evaluateExpression("1m - 10cm", "mm"));
    }

    @Test
    void testMixedUnits() {
        assertEquals(1090, MetricConvertor.evaluateExpression("10cm + 1m - 10mm", "mm"));
    }

    @Test
    void testToMillimeters() {
        assertEquals(1000, MetricConvertor.toMillimeters(1, "m"));
        assertEquals(1000000, MetricConvertor.toMillimeters(1, "km"));
    }

    @Test
    void testFromMillimeters() {
        assertEquals(1, MetricConvertor.fromMillimeters(1000, "m"));
        assertEquals(1, MetricConvertor.fromMillimeters(1000000, "km"));
    }
}

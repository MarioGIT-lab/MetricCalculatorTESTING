package Rocxoiu_Mario;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedConvertorTest {

    @ParameterizedTest
    @CsvSource({
            "'10cm + 1m - 10mm', mm, 1090",
            "'5m + 200cm', cm, 700",
            "'1km - 999m', m, 1",
            "'10dm + 10cm', mm, 1100"
    })
    void testExpressions(String expression, String outputUnit, int expected) {
        int result = MetricConvertor.evaluateExpression(expression, outputUnit);
        assertEquals(expected, result);
    }
}

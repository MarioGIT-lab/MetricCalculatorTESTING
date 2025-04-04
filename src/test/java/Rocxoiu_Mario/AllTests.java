package Rocxoiu_Mario;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        MetricConvertorUnitTest.class,
        ParameterizedConvertorTest.class
})
public class AllTests {
}
package Rocxoiu_Mario;

public class Main {
    public static void main(String[] args) {
        String expression1 = "10cm + 1m - 10mm";
        String outputUnit1 = "mm";
        int result1 = MetricConvertor.evaluateExpression(expression1, outputUnit1);
        System.out.println(expression1 + " = " + result1 + " " + outputUnit1);

        String expression2 = "5m + 200cm";
        String outputUnit2 = "cm";
        int result2 = MetricConvertor.evaluateExpression(expression2, outputUnit2);
        System.out.println(expression2 + " = " + result2 + " " + outputUnit2);

        String expression3 = "1km - 999m";
        String outputUnit3 = "m";
        int result3 = MetricConvertor.evaluateExpression(expression3, outputUnit3);
        System.out.println(expression3 + " = " + result3 + " " + outputUnit3);
    }
}

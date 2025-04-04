package Rocxoiu_Mario;

public class MetricConvertor {

    public static int toMillimeters(int value, String unit) {
        unit = unit.toLowerCase();

        return switch (unit) {
            case "mm" -> value;
            case "cm" -> value * 10;
            case "dm" -> value * 100;
            case "m" -> value * 1000;
            case "km" -> value * 1000000;
            default -> throw new IllegalArgumentException("Unsupported length unit: " + unit);
        };
    }

    public static int fromMillimeters(int valueInMm, String targetUnit) {
        targetUnit = targetUnit.toLowerCase();

        return switch (targetUnit) {
            case "mm" -> valueInMm;
            case "cm" -> valueInMm / 10;
            case "dm" -> valueInMm / 100;
            case "m" -> valueInMm / 1000;
            case "km" -> valueInMm / 1000000;
            default -> throw new IllegalArgumentException("Unsupported target unit: " + targetUnit);
        };
    }

    public static int evaluateExpression(String expression, String outputUnit) {
        String[] tokens = expression.split(" ");
        int totalMm = 0;
        String operator = "+";

        for (String token : tokens) {
            if (token.equals("+") || token.equals("-")) {
                operator = token;
            } else {
                String number = token.replaceAll("[^0-9]", "");
                String unit = token.replaceAll("[0-9]", "");
                int mmValue = toMillimeters(Integer.parseInt(number), unit);
                totalMm += operator.equals("+") ? mmValue : -mmValue;
            }
        }

        return fromMillimeters(totalMm, outputUnit);
    }
}
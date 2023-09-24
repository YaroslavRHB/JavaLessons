package homeworks.august.hw_03_08_23;

public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }
}

class CalculatorMain {
    public static void main(String[] args) {
        System.out.println(Calculator.add(5, 6));
        System.out.println(Calculator.subtract(7, 8));
        System.out.println(Calculator.multiply(9, 10));
        System.out.println(Calculator.divide(11, 12));

    }
}

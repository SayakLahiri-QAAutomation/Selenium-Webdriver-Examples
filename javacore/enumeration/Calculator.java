package corejava.enumeration;

/**
 * Created by Maor on 5/22/2018.
 */

public enum Calculator {

    // Operation
    PLUS,
    MINUS,
    TIMES,
    DIVIDE,
    MODULUS;

    double calculate (double x, double y) {

        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            case MODULUS :
                return x % y;
            default:
                throw new AssertionError("Unknown operations " + this);

        }
    }

    public static void main(String[] args) {

        Calculator op = Calculator.valueOf("plus".toUpperCase());
        System.out.println(op.calculate(10, 3));

        double result = Calculator.MODULUS.calculate(4,3);
        System.out.println(result);

        System.out.println("calculate operations:");
        for (Calculator status : Calculator.values()) {
            System.out.println(status);

        }
    }
}

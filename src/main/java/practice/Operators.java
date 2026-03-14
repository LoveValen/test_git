package practice;

/**
 * Operator demo.
 */
public class Operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("=== Arithmetic ===");
        System.out.println("Add: " + (a + b));
        System.out.println("Subtract: " + (a - b));
        System.out.println("Multiply: " + (a * b));
        System.out.println("Divide: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        System.out.println("\n=== Comparison ===");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));

        boolean x = true;
        boolean y = false;

        System.out.println("\n=== Logical ===");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}

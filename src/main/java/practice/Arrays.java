package practice;

/**
 * Array demo.
 */
public class Arrays {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Carol"};

        System.out.println("=== Access elements ===");
        System.out.println("First number: " + numbers[0]);
        System.out.println("First name: " + names[0]);

        System.out.println("\n=== Length ===");
        System.out.println("numbers length: " + numbers.length);
        System.out.println("names length: " + names.length);

        System.out.println("\n=== Iterate numbers ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("\n=== Iterate names ===");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

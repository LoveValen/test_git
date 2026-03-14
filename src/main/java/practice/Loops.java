package practice;

/**
 * Loop demo.
 */
public class Loops {

    public static void main(String[] args) {
        System.out.println("=== for loop ===");
        System.out.println("Numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("\n=== while loop ===");
        System.out.println("Countdown:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }
        System.out.println("Launch!");

        System.out.println("\n=== do-while loop ===");
        int number = 1;
        do {
            System.out.println("Number: " + number);
            number++;
        } while (number <= 3);
    }
}

package practice;

/**
 * Conditional statement demo.
 */
public class Conditionals {

    public static void main(String[] args) {
        int score = 85;
        System.out.println("Score: " + score);

        if (score >= 60) {
            System.out.println("Pass");
        }

        int age = 16;
        System.out.println("\nAge: " + age);

        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

        System.out.println("\nGrade level:");
        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 80) {
            System.out.println("Good");
        } else if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}

package practice;

/**
 * Variable type demo.
 */
public class VariableTypes {

    public static void main(String[] args) {
        byte level = 1;
        int age = 25;
        long population = 1_400_000_000L;

        double price = 99.99;
        float rate = 3.5f;

        char grade = 'A';
        String name = "Student";

        boolean isStudent = true;

        System.out.println("Level: " + level);
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Rate: " + rate);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
        System.out.println("Is student: " + isStudent);
    }
}

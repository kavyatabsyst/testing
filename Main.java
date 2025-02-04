import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a welcome message
        System.out.println("Hello, World!");

        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        // Print a personalized greeting
        System.out.println("Welcome, " + name + "!");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

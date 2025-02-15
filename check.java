import java.util.Scanner; // Importing Scanner class for user input

public class check {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Reading integer input

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive."); // Output for positive number
        } else if (number < 0) {
            System.out.println("The number is negative."); // Output for negative number
        } else {
            System.out.println("The number is zero."); // Output for zero
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}


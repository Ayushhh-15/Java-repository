import java.util.Scanner; // Importing Scanner class for user input

public class greatestint {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter three integers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int greatest; // Variable to store the greatest number

        // Using nested if-else statements to determine the greatest number
        if (num1 > num2) {
            if (num1 > num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            if (num2 > num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }

        // Displaying the greatest number
        System.out.println("The greatest number is: " + greatest);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}


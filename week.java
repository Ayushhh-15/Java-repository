import java.util.Scanner; // Importing Scanner class for user input

public class week {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter a number between 1 and 7
        System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
        int dayNumber = scanner.nextInt();

        // Using switch statement to determine the day of the week
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();
        
        int first = 0, second = 1, next;
        
        System.out.println("Fibonacci Series up to " + N + " terms:");
        for (int i = 0; i < N; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number
            next = first + second; // Compute the next term
            first = second; // Move to the next position
            second = next;
        }
        
        scanner.close();
    }
}

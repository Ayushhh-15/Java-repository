import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 6}; // Given array
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();
        
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        
        System.out.println("Occurrences of " + target + ": " + count);
        scanner.close();
    }
}

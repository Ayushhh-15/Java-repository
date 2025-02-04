import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        while (n != 0) 
        {
            sum= sum + n%10;
            n= n/10;
        }
        System.out.println("Sum of digits is: " + sum);
        sc.close();
    }
}
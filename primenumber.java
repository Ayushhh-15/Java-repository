public class primenumber {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total prime numbers between 1 and 1000: " + count);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible, it's not a prime
        }
        return true;
    }
}

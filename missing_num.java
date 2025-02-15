public class missing_num {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4}; // Given array
        int N = arr.length + 1; // Since one number is missing

        int expectedSum = N * (N + 1) / 2; // Sum of first N natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num; // Sum of elements in the array
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}

public class second_largest_int {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Given array

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) { 
                secondLargest = largest; // Update second largest
                largest = num; // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num; // Update second largest if it's distinct from largest
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}

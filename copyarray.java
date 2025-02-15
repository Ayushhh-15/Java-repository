import java.util.Arrays;

public class copyarray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5}; // Given array
        int[] copiedArray = new int[originalArray.length]; // Create new array with same length

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i]; // Copy elements one by one
        }

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }
}

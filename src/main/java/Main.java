import java.util.*;

// Bubble Sort Example
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12};
        System.out.println("Initial Array:" + Arrays.toString(arr));

        // Loop through each element of the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare adjacent elements and swap if needed
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Final Array:" + Arrays.toString(arr));
    }
}

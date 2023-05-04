import java.util.*;

// Merge Sort Example

/* In this code, we first define an array arr with some unsorted elements.
We then call the mergeSort function, which recursively sorts the array using a divide-and-conquer approach.
The mergeSort function splits the array into two halves, sorts each half recursively using the mergeSort function,
and then merges the two sorted halves using the merge function.
The merge function creates two temporary arrays to hold the left and right sub-arrays,
and then merges them back into the original array in sorted order.
*/

public class App {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Initial Array:" );
        System.out.println(Arrays.toString(arr));
        System.out.println("Final Array:");

        // Call the merge sort function
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively sort the left and right sub-arrays
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted sub-arrays
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // Find the sizes of the left and right sub-arrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays to hold the left and right sub-arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy the elements of the left and right sub-arrays into the temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left sub-array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right sub-array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

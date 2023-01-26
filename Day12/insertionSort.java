package Day12;

// import java.util.*;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 1, 2 };
        int n = arr.length;
        int swaps = 0;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[j + 1]) {
                swaps++;
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        // System.out.println(Arrays.toString(arr)); // OR

        /*
         * for (int i = 0; i < n; i++) {
         * System.out.print(arr[i] + " ");
         */ // OR
        System.out.println(swaps);
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}

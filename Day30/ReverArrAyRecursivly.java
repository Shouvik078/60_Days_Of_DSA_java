package Day30;

import java.util.*;

public class ReverArrAyRecursivly {

    public static void reverseArray(int i, int[] arr, int n) {
        if (i < n) {
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
            reverseArray(++i, arr, --n);
        }
        // swap(arr[i], arr[n - i - 1]);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        reverseArray(0, arr, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}

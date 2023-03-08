package Day44;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 5, 8, 11, 4, 3, 7, 2, 10 };
        int n = arr.length;
        qs(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qs(int[] arr, int l, int r) {
        if (l < r) {
            int PI = partition(arr, l, r);
            qs(arr, l, PI - 1);
            qs(arr, PI + 1, r);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        arr[right] = arr[i];
        arr[i] = pivot;
        return i;
    }

}

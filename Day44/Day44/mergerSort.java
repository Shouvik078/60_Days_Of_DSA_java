package Day44;

import java.util.*;

class Solution {
    static void mergeSort(int[] arr, int l, int r) {
        // Your code here
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int[] b = new int[r - l + 1];
        int i = l; // its L
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
                k++;
            } else {
                b[k] = arr[j];
                j++;
                k++;
            }
        }

        // any one array end
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }
        while (j <= r) {
            b[k] = arr[j];
            j++;
            k++;
        }

        k = 0;
        for (int p = l; p <= r; p++) {
            arr[p] = b[k];
            k++;
        }
    }
}

public class mergerSort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();
        Solution.mergeSort(a, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        input.close();
    }
}

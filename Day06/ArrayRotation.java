package Day06;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    public static void rotateArray(int arr[], int n, int k) {
        // Write code here
        k = k % n;
        /*
         * for(int i=0;i<k;i++)
         * {
         * rotate(arr);
         * }
         * for(int x : arr)
         * {
         * System.out.print(x +" ");
         * }
         */
        int[] ans = new int[n]; // creating same size another array
        for (int i = 0; i < n; i++) {
            ans[i] = arr[(i + k) % n]; // taking arr kth to ans[0]

        }
        for (int x : ans) {
            System.out.print(x + " ");
        }

    }

    // first rotate one time left to right
    public static void rotate(int arr[]) {
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1]; // left shifting
        }
        arr[n - 1] = temp;
    }

}

package Day37;

import java.util.*;

public class chandan {

    public static int[] sort_array(int arr[], int length) {
        Arrays.sort(arr); // #2. 1 4 7 8 9 10
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int a = Math.abs(arr[i] - 5);
                int b = Math.abs(arr[j] - 5);
                if (a > b) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr; // #3. 4 7 8 1 9 10
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // #1. 7 8 10 1 4 9
        }
        int[] output = sort_array(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(output[i] + " "); // #return arr printing 4 7 8 1 9 10
        sc.close();
    }
}

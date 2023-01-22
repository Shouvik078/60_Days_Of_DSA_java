package Day11;

import java.util.*;

public class maxoccur {

    static int maximum_occurrence(int arr[], int n) {
        // Write code here
        Arrays.sort(arr);
        int maxoccur = 0;
        int elem = 0;
        int s = 0;
        int e = 0;
        while (s < n) {
            while (e < n && arr[e] == arr[s]) {
                e++;
            }
            int blocksize = e - s;
            int element = arr[s];
            if (blocksize > maxoccur) {
                maxoccur = blocksize;
                elem = element;
            }
            s = e;
        }
        return elem;
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));
        sc.close();
    }
}

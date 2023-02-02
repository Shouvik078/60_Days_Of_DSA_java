package Day18;

import java.util.*;

public class ArrayProblem6_2 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int ans = ArrayProblem6(n, arr);
        System.out.println(ans);
        sc.close();
    }

    public static int ArrayProblem6(int n, int[] arr) {
        // Write code here
        int distance = Integer.MAX_VALUE;
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0 && prev == -1) {
                prev = i;
            } else if (arr[i] >= 0 && arr[i] % 2 == 0 && prev != -1) {
                distance = Math.min(distance, i - prev);
                prev = i;
            }
        }
        if (distance == Integer.MAX_VALUE) {
            return -1;
        }
        return distance;
    }
}
package Day20;

// Java program to print largest contiguous array sum
import java.util.*;

public class maximumSUBarray {

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }

    // Function Call
    static int maxSubArraySum(int arr[]) {
        // your code here
        int ans = Integer.MIN_VALUE;
        int max_from_left = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int best_at_i = max_from_left + arr[i];
            if (best_at_i > ans) {
                ans = best_at_i;
            }
            max_from_left = Math.max(0, best_at_i);
        }
        return ans;
    }
}

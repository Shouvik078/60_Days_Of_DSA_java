package Day31;

import java.util.*;

public class array11times {
    static int array11(int[] nums, int index) {
        // Write your code here
        int count = 0;
        if (index == nums.length)
            return 0;
        if (nums[index] == 11) {
            ++count;
        }
        return count + array11(nums, index + 1);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array11(arr, 0));
        sc.close();
    }
}

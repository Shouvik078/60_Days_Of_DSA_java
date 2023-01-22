package Day11;

import java.util.*;

public class greatersmallestelement {
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here
        int[] temp = new int[arr.length];
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] > arr[i]) {
                    ans[i] = temp[j];
                    break;
                } else {
                    ans[i] = -10000000;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for (int a : ans) {
            System.out.print(a + " ");
            sc.close();
        }
    }
}
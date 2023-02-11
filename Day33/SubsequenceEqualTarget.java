package Day33;

import java.util.*;

public class SubsequenceEqualTarget {

    public static void printS(int ind, ArrayList<Integer> ans, int s, int sum, int[] arr, int n) {
        if (ind == n) {
            if (s == sum) {
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }
        ans.add(arr[ind]);
        s = s + arr[ind];
        printS(ind + 1, ans, s, sum, arr, n);
        s -= arr[ind];
        ans.remove(ans.size() - 1);
        printS(ind + 1, ans, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = 3; // arr length
        int sum = 2; // target
        ArrayList<Integer> ans = new ArrayList<>();
        printS(0, ans, 0, sum, arr, n);

    }
}

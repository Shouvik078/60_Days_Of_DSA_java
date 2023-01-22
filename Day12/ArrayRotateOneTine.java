package Day12;

import java.util.ArrayList;

public class ArrayRotateOneTine { // using Arraylist
    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 6, 1 };
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n - 1]);
        for (int i = 0; i < n - 1; i++) {
            ans.add(arr[i]);
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

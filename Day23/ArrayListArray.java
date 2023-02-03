package Day23;

import java.util.*;

public class ArrayListArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(7);
        ans.add(9);
        ans.add(4);

        Integer[] arr = new Integer[ans.size()];

        ans.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

package Day23;

import java.util.*;

public class ArrayListMerge {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(7);
        ans.add(9);
        ans.add(4);

        Object[] arr = ans.toArray();
        for (Object i : arr) {
            System.out.println(i);
        }

    }
}

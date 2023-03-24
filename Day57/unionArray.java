package Day57;

import java.util.*;

public class unionArray {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 3 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        for (int i = 0; i < B.length; i++) {
            set.add(B[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}

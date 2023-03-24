package Day57;

import java.util.*;

public class UnionStringMap {

    public static <I> void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 3 };
        HashMap<Integer, Integer> table = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            table.put(A[i], table.getOrDefault(A[i], 0) + 1);
        }
        for (int i = 0; i < B.length; i++) {
            table.put(B[i], table.getOrDefault(B[i], 0) + 1);
        }
        /*
         * System.out.println(table);
         * for (int key : table.keySet()) {
         * System.out.println(key + " " + table.get(key));
         * }
         */
        for (int k : table.keySet()) {
            Object key;
            System.out.println(k + " " + table.get(k));
        }
    }
}
package Day57;

//import java.security.KeyStore.Entry;
import java.util.*;

class Solution {
    static int divideLadoo(int N, int[] A) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    }
}

public class Stringmapping {
    public static void main(String[] args) {
        HashMap<Character, Integer> table = new HashMap<>();
        String s = "mann";
        for (int i = 0; i < s.length(); i++) {
            table.put(s.charAt(i), table.getOrDefault(s.charAt(i), 0) + 1);
        }

        System.out.println(table);
        for (java.util.Map.Entry<Character, Integer> it : table.entrySet()) {
            System.out.println(it);
        }

    }
}

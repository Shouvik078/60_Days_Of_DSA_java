package Day58;

import java.util.*;
import java.util.Map.Entry;

// Time complexity = O(N)
// space complexity = O(1)
public class countChar {
    public static void main(String[] args) {
        String s = "nilanjana";
        HashMap<Character, Integer> table = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        // System.out.println(table);
        for (Entry<Character, Integer> key : table.entrySet()) {
            System.out.println(key);
        }
    }
}

package Day60;

import java.util.*;
import java.util.Map.Entry;

public class countIdentical {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (Entry<Character, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}

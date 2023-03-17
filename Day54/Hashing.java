package Day54;

import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Shouvik");
        map.put(2, "Arif");
        map.put(3, "Aniket");

        // System.out.println(map);
        for (Integer no : map.keySet()) {
            System.out.println("Keys " + no + " Values are " + map.get(no));
        }

    }
}

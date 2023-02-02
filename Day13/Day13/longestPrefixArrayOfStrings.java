package Day13;

import java.util.*;

class Solution {
    public static String longestCommonStarting(String[] strings, int n) {
        // Write your code here
        // Write your code here
        String s = strings[0];
        for (int j = s.length(); j > 0; j--) {
            String prefix = s.substring(0, j);
            if (isCommon(strings, prefix)) {
                return prefix;
            }
        }
        return "";
    }

    public static boolean isCommon(String[] arr, String t) {
        // Checks whether t is a prefix in all other strings in the array
        // If yes , returns true.
        // If no returns false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(t) != 0) {
                return false;
            }
        }
        return true;
    }
}

public class longestPrefixArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }
        /*
         * Solution Obj = new Solution();
         * String lcs = Obj.longestCommonStarting(strings, n); // need to un comment
         * if (lcs.equals(""))
         * System.out.println("-1");
         * else
         * System.out.println(lcs);
         */
        sc.close();
    }
}
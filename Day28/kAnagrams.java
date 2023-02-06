package Day28;

import java.util.*;

// import java.lang.*;
public class kAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();
        Solution ob = new Solution();
        if (ob.areKAnagrams(str1, str2, k) == true)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if (s1.length() != s2.length())
            return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int i = 0; i < 26; i++) {
            c += Math.abs(freq1[i] - freq2[i]);
        }
        c /= 2;
        if (c <= k)
            return true;
        else
            return false;
    }
}

package Day14_2;

import java.util.*;

class Solution {
    public String mergeStrings(String s1, String s2) {
        // Write code here
        int n = s1.length();
        int m = s2.length();
        int i = 0;
        int j = 0;
        String ans = "";
        while (i < n && j < m) {
            ans += s1.charAt(i);
            ans += s2.charAt(j);
            i++;
            j++;
        }
        while (i < n) {
            ans += s1.charAt(i);
            i++;
        }
        while (j < m) {
            ans += s2.charAt(j);
            j++;
        }
        return ans;
    }
}

public class MergeStringIndexWise {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next(), s2 = input.next();
        Solution Obj = new Solution();
        System.out.println(Obj.mergeStrings(s1, s2));
        input.close();
    }
}
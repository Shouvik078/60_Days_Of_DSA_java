package Day14;

import java.util.*;

class Solution {
    static int isCyclicRotation(String s1, String s2) {
        // Write your code here
        String ans = "";
        ans = ans + s1 + s1;
        if ((ans.indexOf(s2)) == -1) {
            return 0;
        } else {
            return 1;
        }
    }
}

public class CheckIfOneStringIsARotationOfAnotherString {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String q = sc.next();
        int ans = Solution.isCyclicRotation(p, q);
        System.out.println(ans);
        sc.close();
    }
}
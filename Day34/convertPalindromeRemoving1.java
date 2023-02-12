package Day34;

import java.util.*;

class Solution {
    public static int solve(String A) {
        // Write code here and print output
        int n = A.length() - 1;
        int i = 0;
        while (i < n) {
            if (A.charAt(i) == A.charAt(n)) {
                i++;
                n--;

            } else {
                // ccd
                // cd
                // cc
                // isPalindrome (i,n,s)
                if (isPalindrome(i + 1, n, A)) // skip first char & checking
                {
                    return 1;
                } else if (isPalindrome(i, n - 1, A)) // skip last char & checking
                {
                    return 1;
                } else {
                    return 0;
                }
            }

        }
        return 1;
    }

    public static boolean isPalindrome(int i, int n, String s) {
        while (i < n) {
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
}

public class convertPalindromeRemoving1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        Solution Obj = new Solution();
        int ans = Obj.solve(A);
        System.out.println(ans);
        sc.close();
    }
}

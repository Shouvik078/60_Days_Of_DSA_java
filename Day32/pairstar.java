package Day32;

import java.util.*;

public class pairstar {
    static String PairStar(String str) {
        // Write your code here
        return f(str, 0);
    }

    static String f(String s, int n) {
        if (n == s.length() - 1)
            return s.substring(s.length() - 1, s.length());
        // last charecter
        String ans = "";
        if (s.charAt(n) == s.charAt(n + 1)) {
            // ans = ans + s.charAt(n) + "*" + f(s,n+1);
            return ans + s.charAt(n) + "*" + f(s, n + 1);
        } else {
            ans = ans + s.charAt(n);
            return ans + f(s, n + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(PairStar(s));
        sc.close();
    }
}

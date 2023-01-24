package Day15;

import java.util.*;

public class XORinTwoString {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String A = scn.nextLine();
        String B = scn.nextLine();
        StringBuilder a = new StringBuilder(A);
        StringBuilder b = new StringBuilder(B);
        StringBuilder c = solve(a, b);
        System.out.println(c);
        scn.close();
    }

    static StringBuilder solve(StringBuilder a, StringBuilder b) {
        // your code here
        StringBuilder ans = new StringBuilder();

        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                ans.append(0);
            } else {
                ans.append(1);
            }
        }
        return ans;
    }
}

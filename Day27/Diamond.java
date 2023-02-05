package Day27;

import java.util.*;

class Solution {
    public void pattern(int n) {
        // your code here
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Diamond {

    public static void main(String[] args) throws Throwable {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close();
        Solution solution = new Solution();
        solution.pattern(n);
    }
}
package Day17;

import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testcase = 1; testcase <= t; testcase++) {
            int n = sc.nextInt();
            n = (n + 1) / 2;
            sc.close();
            for (int i = 1; i <= n; i++) {
                // ith line
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}

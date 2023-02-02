package Day22;

import java.util.*;

public class DiamondAccio {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // lower part

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}

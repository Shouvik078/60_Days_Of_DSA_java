package Day50;

import java.util.Scanner;

public class Diamonddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int i, j;
        int c1 = (n - 1) / 2;
        int c2 = 3 * n / 2 - 1;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i + j <= c1 || i - j >= c1 || j - i >= c1 || i + j >= c2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

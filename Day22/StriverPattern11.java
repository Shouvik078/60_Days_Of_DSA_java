package Day22;

import java.util.Scanner;

public class StriverPattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            int start = 1;
            if (i % 2 == 1)
                start = 1;
            else
                start = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();

        }
    }
}

package Day20;

import java.util.*;

public class chessSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }
        alternateMatrixSum(mat, n);
        System.out.println('\n');
        sc.close();
    }

    public static void alternateMatrixSum(int[][] mat, int n) {
        // your code here
        int black = 0;
        int white = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    black += mat[i][j];
                } else {
                    white += mat[i][j];
                }
            }
        }
        System.out.println(black);
        System.out.println(white);
    }
}

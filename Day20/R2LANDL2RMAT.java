package Day20;

import java.util.*;

class Solution {
    public void printElementsAlternately(int[][] mat, int m, int n) {
        // Write code here and print output
        for (int i = 0; i < m; i++) { // row with ith index
            if (i % 2 == 0) { // left to right
                for (int k = 0; k < n; k++) {
                    System.out.print(mat[i][k] + " ");
                }
            } else { // rigth to left
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}

public class R2LANDL2RMAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat, m, n);

        sc.close();
    }
}

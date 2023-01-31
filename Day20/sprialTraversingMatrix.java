package Day20;

import java.util.*;

public class sprialTraversingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mat[i][j] = sc.nextInt();
            }
        }

        spirallyTraverse(mat);
        System.out.println('\n');
        sc.close();
    }

    public static void spirallyTraverse(int[][] mat) {
        // your code here
        int m = mat.length;
        int n = mat[0].length;
        int top = 0;
        int bot = m - 1;
        int right = n - 1;
        int left = 0;
        int dir = 0;

        // dir 0 = -->
        // dir 1 = top to bottom
        // dir 2 = right to left
        // dir 3 = bottom to up
        while (top <= bot && left <= right) {
            if (dir == 0) {
                for (int j = left; j <= right; j++) {
                    System.out.print(mat[top][j] + " ");
                }
                top++;
                dir = 1;
            } else if (dir == 1) {
                for (int i = top; i <= bot; i++) {
                    System.out.print(mat[i][right] + " ");
                }
                right--;
                dir = 2;
            } else if (dir == 2) {
                for (int j = right; j >= left; j--) {
                    System.out.print(mat[bot][j] + " ");
                }
                bot--;
                dir = 3;
            } else {
                for (int i = bot; i >= top; i--) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
                dir = 0;
            }
        }
    }
}

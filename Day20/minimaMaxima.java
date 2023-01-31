package Day20;

import java.util.*;

public class minimaMaxima {
    public static int maximaMinima(int[][] mat) {
        // Write code here
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int elem = mat[i][j];
                int x = minRow(mat, i);
                int y = maxCol(mat, j);
                if (elem == x && elem == y) {
                    return elem;
                }
            }
        }
        return -1;
    }

    // finding minimum element in row
    public static int minRow(int[][] mat, int rows) {
        int minn = Integer.MAX_VALUE;
        for (int j = 0; j < mat.length; j++) {
            if (mat[rows][j] < minn) {
                minn = mat[rows][j];
            }
        }
        return minn;
    }

    public static int maxCol(int[][] mat, int col) {
        int maxx = Integer.MIN_VALUE;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > maxx) {
                maxx = mat[i][col];
            }
        }
        return maxx;
    }

    // finding maximum element in column
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}

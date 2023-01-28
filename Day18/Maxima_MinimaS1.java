package Day18;

import java.util.*; // My Code Solution 1

public class Maxima_MinimaS1 {
    public static int maximaMinima(int[][] mat) {
        // Write code here
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            int min_row = mat[i][0];
            int col_ind = 0;
            for (int j = 1; j < n; j++) {
                if (min_row > mat[i][j]) {
                    min_row = mat[i][j];
                    col_ind = j;
                }
            }
            int k;
            for (k = 0; k < n; k++)

                if (min_row < mat[k][col_ind])
                    break;
            if (k == n)
                return min_row;

        }
        return -1;

    }

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

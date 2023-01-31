package Day20;

import java.util.*;

class Solution {
    public void rotateBy90(int[][] mat) {
        // Your code here
        int n = mat.length;
        matrixTranspose(mat); // calling matrix transpose function
        for (int i = 0; i < n; i++) {
            // row ined i
            int start = 0;
            int end = n - 1;
            // swaping first element to last element
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    // transpose the matrix
    public void matrixTranspose(int[][] mat) {
        // Write your code here
        int n = mat.length;
        for (int i = 0; i < n; i++) { // row with ith index
                                      // i=j (Principal diagonal) so start from j>i
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //
    }
}

public class nintyDegreeRotation {
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
        Solution Obj = new Solution();
        Obj.rotateBy90(mat);
        System.out.println('\n');
        sc.close();
    }
}
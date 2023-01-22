package Day12;

import java.util.Scanner;

import java.util.*;

public class sortMatrixColumnWise {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution.sortCol(mat, n, m);
        sc.close();

    }

    class Solution {
        public static void sortCol(int[][] mat, int n, int m) {
            // Write your code and print here
            int[] ans = new int[n]; // Decleare array of n size for column
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    ans[i] = mat[i][j]; // storing all column values to ans
                }
                Arrays.sort(ans); // then sort the ans column

                for (int i = 0; i < n; i++) {
                    mat[i][j] = ans[i]; // now sorting column insert to mat [][]
                }
            }
            // printing all matrix element
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
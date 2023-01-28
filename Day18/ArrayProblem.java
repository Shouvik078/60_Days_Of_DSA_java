/*
 * package Day18; Solution 1
 * 
 * import java.util.*;
 * 
 * public class ArrayProblem {
 * public static void main(String[] args) throws Throwable {
 * Scanner sc = new Scanner(System.in);
 * int n = sc.nextInt();
 * int arr[] = new int[n];
 * sc.close();
 * for (int i = 0; i < n; ++i) {
 * arr[i] = sc.nextInt();
 * }
 * int ans = ArrayProblem6(n, arr);
 * System.out.println(ans);
 * }
 * 
 * public static int ArrayProblem6(int n, int[] arr) {
 * // Write code here
 * int count = 0; // odd
 * int count1 = 0; // even
 * for (int i = 0; i < n; i++) {
 * if (arr[i] % 2 != 0 && arr[i] > 0) {
 * count++;
 * }
 * if (arr[i] % 2 == 0 && arr[i] > 0) {
 * count1++;
 * }
 * }
 * if (count1 == 1 || count1 == 0) {
 * // System.out.println(-1);
 * return -1;
 * }
 * 
 * int ans = 100000000;
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
 * ans = Math.min(ans, j - i);
 * }
 * }
 * }
 * return ans;
 * }
 * }
 */
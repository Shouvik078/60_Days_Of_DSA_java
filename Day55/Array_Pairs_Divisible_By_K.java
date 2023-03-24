/*
 * package Day55;
 * 
 * import java.util.*;
 * 
 * class Solution {
 * public boolean arrayPairs(int[] arr, int k) {
 * // write code here
 * // approach : we map rem of array element
 * HashMap<Integer, Integer> hm = new HashMap<>();
 * int n = arr.length;
 * for (int i = 0; i < n; i++) {
 * int rem = arr[i] % k;
 * // getOrDefault return value of key
 * hm.put(rem, hm.getOrDefault(rem, 0) + 1);
 * }
 * for (int i = 0; i < k; i++) {
 * if (i == 0) {
 * if (hm.getOrDefault(0, 0) % 2 == 1) // 0 can't be odd
 * return false;
 * }
 * // checking i value with k-i value in hashTable
 * else if (hm.getOrDefault(i, 0) != hm.getOrDefault(k - i, 0)) {
 * return false;
 * }
 * }
 * return true;
 * }
 * }
 * 
 * public class Array_Pairs_Divisible_By_K {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n, k;
 * n = sc.nextInt();
 * k = sc.nextInt();
 * int arr[] = new int[n];
 * for (int i = 0; i < n; i++)
 * arr[i] = sc.nextInt();
 * Solution Obj = new Solution();
 * if (Obj.arrayPairs(arr, k)) {
 * System.out.println("true");
 * } else {
 * System.out.println("false");
 * }
 * }
 * }
 */
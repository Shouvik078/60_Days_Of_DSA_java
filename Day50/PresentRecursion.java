/*
 * package Day50;
 * 
 * public class PresentRecursion {
 * 
 * 
 * public static boolean isPresent(int [] arr,int size, int k)
 * {
 * if(size==0) return false;
 * if(arr[0]==k) return true;
 * 
 * else
 * {
 * return isPresent(arr+1, size-1, k);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = { 1, 5, 3, 2, 6 };
 * int size = 5;
 * int k = 2;
 * isPresent(arr, size, k);
 * 
 * if (isPresent) {
 * System.out.println("Present");
 * } else {
 * System.out.println("Abssent");
 * }
 * }
 * }
 */
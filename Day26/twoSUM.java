package Day26;

import java.util.*;

public class twoSUM {

    public static int[] twoSum(int[] arr, int target) {
        // Your code here
        int[] ans = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] + arr[i] == target) {
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }
}

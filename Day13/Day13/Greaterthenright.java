package Day13;

import java.io.*;
import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[], int n) {
        // Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (arr[i] >= max) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}

public class Greaterthenright {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        String inputLine[] = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        // Solution obj = new Solution(); // need to un comment
        StringBuffer str = new StringBuffer();
        ArrayList<Integer> res = new ArrayList<Integer>();
        // res = obj.leaders(arr, n); // need to un comment
        for (int i = 0; i < res.size(); i++) {
            str.append(res.get(i) + " ");
        }
        System.out.println(str);
    }
}

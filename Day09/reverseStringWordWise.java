package Day09;

import java.util.*;

public class reverseStringWordWise {
    public static String reverseWords(String s) {
        // your code here
        String[] arrs = s.split(" ");
        int n = arrs.length;
        int start = 0;
        int end = n - 1;
        String temp = "";
        while (start < end) {
            temp = arrs[start];
            arrs[start] = arrs[end];
            arrs[end] = temp;
            start++;
            end--;
        }
        String ans = "";
        for (int i = 0; i < n; i++) {
            ans += arrs[i];
            ans += " ";
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // String p = sc.nextLine();
        sc.close();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
    }
}

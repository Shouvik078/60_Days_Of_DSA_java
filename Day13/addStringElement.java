/*** Add strings element and return string  */
package Day13;

import java.util.*;

class Solution {

    public static String addNumbers(String[] numbers, int n) {
        // Write your code here
        String ans = "0";
        for (int i = 0; i < numbers.length; i++) {
            ans = sum(ans, numbers[i]);
        }
        return ans;
    }

    public static String sum(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        int sz = Math.max(a.length, b.length) + 1;
        char[] ans = new char[sz];
        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int k = sz - 1;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += (a[i] - '0');
                i--;
            }
            if (j >= 0) {
                sum += (b[j] - '0');
                j--;
            }
            ans[k] = ((sum % 10) + "").charAt(0);
            k--;
            carry = sum / 10;
        }
        ans[0] = (carry + "").charAt(0);
        String res = new String(ans);
        if (res.charAt(0) == '0') // for checking initial value zero or not
        {
            return res.substring(1);
        }
        return res;
    }
}

public class addStringElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLine();
        }

        // Solution Obj = new Solution(); // this two needs to un comment
        // System.out.println(Obj.addNumbers(numbers, n));
        sc.close();
    }
}
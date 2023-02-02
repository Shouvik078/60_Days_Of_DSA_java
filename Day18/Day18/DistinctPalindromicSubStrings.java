package Day18;

import java.util.*;

public class DistinctPalindromicSubStrings {
    static void palindromeSubStrs(String s) {
        // Write your code here
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String ss = s.substring(i, j);
                if (isPalindrome(ss)) // go next if true
                {
                    if (isPresent(ss, res) == false) // go next if false
                    // if (!isPresent(ss,res)) // same as upper line
                    {
                        res.add(ss);
                    }
                }
            }
        }
        Collections.sort(res); // sort the string as per Q.
        for (String X : res) {
            System.out.println(X);
        }
    }

    // checking string is palindrome or not
    public static boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // checking string present in ArrayString or not
    public static boolean isPresent(String s, ArrayList<String> arr) {
        // return true if s is present in arr
        // else return false
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        palindromeSubStrs(s);
    }
}

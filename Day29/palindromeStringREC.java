package Day29;

import java.util.Scanner;

public class palindromeStringREC {

    public static boolean isPalindrome(int i, String s) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return isPalindrome(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(0, s));
        sc.close();
    }
}

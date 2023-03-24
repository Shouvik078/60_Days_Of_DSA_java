package Day57;

import java.util.Scanner;

public class palindromestring {

    public static boolean checkPalindrome(String s) {
        int si = 0;
        int ei = s.length() - 1;
        while (si < ei) {
            if (s.charAt(si) != s.charAt(ei)) {
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s));

    }
}

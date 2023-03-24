package Day57;

import java.util.*;

public class StringPalindrome {

    public static boolean isPalindrome(String s) {
        int si = 0;
        int ei = s.length() - 1;
        while (si < ei) {
            if (s.charAt(si) != s.charAt(ei))
                return false;
            si++;
            ei--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(isPalindrome(s1));
        sc.close();
    }
}

package Day57;

import java.util.*;

public class colindrome {

    public static boolean checkColindrome(String s) {
        if (s.length() < 6) {
            return false;
        }
        for (int i = 0; i + 5 < s.length(); i++) {
            int si = i;
            int ei = i + 5;
            while (si < ei) {
                if (s.charAt(si) == s.charAt(ei)) {
                    si++;
                    ei--;
                }
                if (si > ei) {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (checkColindrome(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

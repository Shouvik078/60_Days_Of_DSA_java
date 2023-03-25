package Day58;

import java.util.*;
import java.util.Scanner;

public class checkCanPalindrome {

    public static boolean canPalindrome(String s) {

        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (arr.contains(s.charAt(i))) {
                arr.remove((Character) s.charAt(i));
            } else {
                arr.add(s.charAt(i));
            }
        }
        if (arr.isEmpty() && s.length() % 2 == 0)
            return true;
        else if (arr.size() == 1 && s.length() % 2 == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(canPalindrome(s));
    }
}

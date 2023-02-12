package Day35;

import java.util.*;

public class Pangram {
    public static void isPangram(String str) {
        // Your code here
        String s = str.toLowerCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] = 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0) {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
        return;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        isPangram(str);
        input.close();

    }
}
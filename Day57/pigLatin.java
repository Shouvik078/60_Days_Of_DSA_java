// pigLatin

package Day57;

import java.util.Scanner;

public class pigLatin {

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }

    public static String pigLatin(String s) {
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return "-1";
        return s.substring(index) + s.substring(0, index) + "ay";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = pigLatin(s);
        System.out.println(ans);
        sc.close();

    }
}

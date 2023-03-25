package Day58;

import java.util.Scanner;

public class maxChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        char ch = 'a';

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            ch = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                if (ch == s.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                ch = s.charAt(i);
            }
        }
        System.out.println(ch);
    }
}

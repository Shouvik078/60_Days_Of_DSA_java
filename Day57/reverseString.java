package Day57;

import java.util.Scanner;

public class reverseString {

    public static void reverse(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        reverse(s1);

    }
}

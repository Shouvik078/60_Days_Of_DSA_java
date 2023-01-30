package Day03;

import java.util.*;

public class whichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // taking input as string
        char c = s.charAt(0); // taking first letter as char
        if (c >= 'A' && c <= 'Z') {
            System.out.println(1);
        } else if (c >= 'a' && c <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}

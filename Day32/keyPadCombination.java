package Day32;

import java.util.*;

public class keyPadCombination {
    static void printKPC(String ques) {
        // Write your code here
        String[] ref = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        f(ques, "", ref);
    }

    static void f(String ques, String asf, String[] ref) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }

        // 78
        char c = ques.charAt(0);
        String inter = ref[c - '0']; // TU
        for (int i = 0; i < inter.length(); i++) {
            f(ques.substring(1), asf + inter.charAt(i), ref);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str);
        sc.close();
    }
}

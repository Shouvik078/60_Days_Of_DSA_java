package Day32;

import java.util.*;

public class countABC {
    static int CountABC(String str, int i) {
        // Write your code here
        if (i >= str.length() - 2)
            return 0;
        int c = CountABC(str, i + 1);

        // .compareTo return 0 when both string are identical
        // let abc=abc
        if ((str.substring(i, i + 3).compareTo("abc")) == 0)
            c++;
        if ((str.substring(i, i + 3).compareTo("aba")) == 0)
            c++;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s, 0));
        sc.close();

    }
}

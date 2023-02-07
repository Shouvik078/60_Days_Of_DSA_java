package Day29;

import java.util.*;

public class DecreaseIncrease {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDI(n);
        scn.close();
    }

    public static void printDI(int n) {
        // your code here
        if (n == 0)
            return;

        System.out.println(n);
        printDI(n - 1);
        System.out.println(n);
    }
}

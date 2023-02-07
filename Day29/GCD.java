package Day29;

import java.util.*;

public class GCD {

    public static int printGCD(int a, int b) {
        int GCD = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                GCD = i;
            }
        }

        return GCD;
    }

    public static int printLCM(int a, int b) {
        int LCM = (a * b) / printGCD(a, b);
        return LCM;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printGCD(a, b));
        System.out.println(printLCM(a, b));
        sc.close();
    }
}
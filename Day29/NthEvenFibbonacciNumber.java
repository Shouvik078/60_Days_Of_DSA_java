package Day29;

import java.util.*;

public class NthEvenFibbonacciNumber {
    static long NthEvenFibonacci(long n) {
        // Write your code here
        if (n < 1)
            return n;
        if (n == 1)
            return 2;

        // fn = fn-1 + fn-2
        // fn = fn-2 + fn-3 + fn-3 + fn-4
        // fn = fn-2 + 2fn-3 + fn-4
        // fn = fn-3 + fn-4 + 2fn-3 + fn-4
        // fn = 3fn-3 + 2fn-4
        // fn = 3fn-3 + fn-4 + fn-5 + fn-6
        // fn = 4fn-3 + fn-6
        // fn = 4*even(fn-1) + even(fn-2)

        // 10^9 + 7 for shaping big long number to long range
        return ((4 * NthEvenFibonacci(n - 1)) % 1000000007 + NthEvenFibonacci(n - 2) % 1000000007) % 1000000007;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(NthEvenFibonacci(n));
        sc.close();
    }
}

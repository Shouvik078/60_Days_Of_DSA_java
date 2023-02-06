package Day28;

import java.util.Scanner;

public class factorialRecursion {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = factorial(n);
        System.out.println(ans);
    }
}

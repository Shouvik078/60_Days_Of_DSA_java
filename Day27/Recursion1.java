package Day27;

import java.util.Scanner;

public class Recursion1 {

    public static void printNumber(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumber(n);
        sc.close();

    }
}

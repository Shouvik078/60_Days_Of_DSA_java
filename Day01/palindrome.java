package Day01;

import java.util.*;

public class palindrome {
    public static void main(String[] args) throws java.lang.Exception {
        // your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0, digit;
        while (n > 0) {
            digit = n % 10;
            sum = sum * 10 + digit;
            n = n / 10;
        }
        sc.close();
        if (temp == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

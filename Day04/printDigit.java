package Day04;

import java.util.*;

public class printDigit {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long digit;
        long reverse = 0;

        // Reverse the input number
        int zero = 0;
        while (n > 0) { // count last zeros
            if (reverse == 0 && n % 10 == 0)
                zero++;
            // reverse
            reverse = (reverse * 10) + n % 10;
            n = n / 10;
        }
        n = reverse;

        // printing digit from last
        while (n > 0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
        // printing last zeros
        for (int i = 0; i < zero; i++) {
            System.out.println(0);
        }
        sc.close();
    }
}

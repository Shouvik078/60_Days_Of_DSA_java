package Day56;

import java.util.*;

public class LeadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // calling Scanner object
        int n = sc.nextInt();
        sc.close();
        int evenSum = 0, oddSum = 0;
        while (n != 0) {
            int digit = n % 10; // we get last digit
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            n = n / 10;
        }
        if (oddSum == evenSum) {
            System.out.println("LeadNumber");
        } else {
            System.out.println("No");
        }
    }
}

package Day10;

import java.util.*;

public class placeValueChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean determineSecondLastDigit(int n) {
        // write code here
        n = n / 10;
        if (n % 10 == 0) {
            return true;
        }
        return false;
    }
}

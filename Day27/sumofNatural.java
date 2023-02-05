package Day27;

import java.util.*;

public class sumofNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumNatural(1, n, 0);
        sc.close();
    }

    public static void sumNatural(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        sumNatural(i + 1, n, sum);
    }

}

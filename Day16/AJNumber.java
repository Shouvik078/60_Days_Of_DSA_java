package Day16;

import java.util.*;

public class AJNumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        StringBuilder str = new StringBuilder(input.nextLine());

        solve(str, n);

        input.close();
    }

    public static boolean isPrime(long num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i * i <= num && i <= 29; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solve(StringBuilder str, int n) {
        // WRITE YOUR CODE HERE
        ArrayList<Integer> aj = new ArrayList<Integer>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            outer: for (int j = 0; j < n && j + i <= n; j++) {
                String s2 = str.substring(j, j + i);
                long num = Long.parseLong(s2);
                if (isPrime(num)) {
                    for (int k = j; k < j + i; k++) {
                        if (aj.contains(k)) {
                            continue outer;
                        }
                    }
                    // System.out.println(s2);
                    count++;
                    aj.add(j);
                    aj.add(j + i - 1);
                }
            }
        }
        System.out.println(count);
    }
}
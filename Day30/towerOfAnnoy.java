package Day30;

import java.util.*;

public class towerOfAnnoy {
    static void toh(int n, int from, int to, int aux) {
        // Write code here

        if (n == 0)
            return;
        toh(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        toh(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        N = sc.nextInt();

        toh(N, 1, 3, 2);

        sc.close();
    }
}

package Day29;

import java.util.*;

public class RecersiveMultiplycation {
    public static int multiplyRecursively(int n, int m) {
        // Write code here and print output
        if (n == 1) {
            return n * m;
        }
        int ans = m + multiplyRecursively(n - 1, m);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int op = multiplyRecursively(n, m);
        System.out.println(op);
        scn.close();
    }
}

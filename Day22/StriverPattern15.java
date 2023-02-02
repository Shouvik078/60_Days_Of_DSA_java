package Day22;

import java.util.Scanner;

public class StriverPattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = n - i + 1; j > 0; j--) {
                System.out.print(ch);
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}

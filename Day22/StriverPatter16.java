package Day22;

import java.util.Scanner;

public class StriverPatter16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch = (char) (ch + 1);
            System.out.println();
        }
    }
}

package Day22;

public class StriverPattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i == 1 || i == 2 * n) {
                for (int j = 1; j <= 2 * n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            else {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= 2 * i - 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

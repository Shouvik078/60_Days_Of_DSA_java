package Day22;

public class StriverPattern18 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
    }
}

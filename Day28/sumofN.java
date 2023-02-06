package Day28;

public class sumofN {

    public static void sumPrint(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumPrint(i - 1, sum + i);
    }

    public static void main(String[] args) {
        int n = 3;
        sumPrint(n, 0);
    }
}

package Day28;

public class LinearOpposite {

    public static void printNumber(int n, int i) {
        if (i == 0)
            return;
        System.out.println(i);
        printNumber(n, i - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = n;
        printNumber(n, i);
    }
}

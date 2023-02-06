package Day28;

public class linearPrinting {
    public static void printNumber(int i, int n) {
        if (i > n)
            return;
        System.out.print(i + " ");
        printNumber(i + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumber(1, n);
    }
}

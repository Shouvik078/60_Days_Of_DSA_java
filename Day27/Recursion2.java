package Day27;

public class Recursion2 {
    public static void main(String[] args) {
        int n = 1;
        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n > 5)
            return;
        System.out.println(n);
        printNumber(n + 1);
    }
}

package Day27;

public class fibonnancciRECURSION {
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n - 2);
    }

    public static void printFib(int a, int b, int n) {

        if (n == 0)
            return;
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }
}

package Day27;

public class StriverFIBONACCI {

    public static int printFib(int n) {
        if (n <= 1)
            return n;
        int last = printFib(n - 1);
        int secondLast = printFib(n - 2);
        return last + secondLast;
    }

    public static void main(String[] args) {
        System.out.println(printFib(7));
    }
}

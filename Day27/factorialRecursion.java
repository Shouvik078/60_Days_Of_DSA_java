package Day27;

public class factorialRecursion {
    public static void main(String[] args) {
        int n = 7;
        int a = calFactorial(n);
        System.out.println("Factorial of " + n + " is " + a);
    }

    public static int calFactorial(int n)

    {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (n * calFactorial(n - 1));
    }

}

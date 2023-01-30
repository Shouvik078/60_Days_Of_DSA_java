package Day01;

public class sumANDproduct

{
    public static void main(String[] args) {
        int n = 532;
        int sum = 0;
        int product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        System.out.println(sum);
        System.out.println(product);
    }
}

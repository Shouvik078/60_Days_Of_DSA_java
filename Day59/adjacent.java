package Day59;

public class adjacent {
    public static void main(String[] args) {
        int n = 372816;
        int rev = 0;
        int temp = n;
        int max = 0;
        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            if (digit > max) {
                max = digit;
            }
            n = n / 10;
        }
        int ans1 = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == max) {
                temp = temp / 10;
                ans1 = temp % 10;
            }
            temp = temp / 10;
        }
        int ans2 = 0;
        // temp = rev;
        while (rev != 0) {
            int digit = rev % 10;
            if (digit == max) {
                rev = rev / 10;
                ans2 = rev % 10;
            }
            rev = rev / 10;
        }
        System.out.println(max);
        System.out.println(ans1);
        System.out.println(ans2);
    }
}

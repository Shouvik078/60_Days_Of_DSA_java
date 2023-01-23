package Day14;

public class stringRotationLeft {
    public static void main(String[] args) {
        String str = "HELLO";
        int n = str.length();
        char last = str.charAt(n - 1);
        String ans = "";
        ans = ans + last;
        ans = ans + str.substring(0, n - 1);

        System.out.println(ans);

    }
}

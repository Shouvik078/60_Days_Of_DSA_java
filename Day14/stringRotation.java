// String rotation one time to right

package Day14;

public class stringRotation {
    public static void main(String[] args) {

        String str = "Hello";
        int n = str.length();
        char ch = str.charAt(0);
        String ans = str.substring(1, n);
        ans = ans + ch;
        System.out.println(ans);

    }
}
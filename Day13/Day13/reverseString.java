package Day13;

public class reverseString {
    public static void main(String[] args) {
        String str = "Shouvik";
        int n = str.length();
        String rev = "";
        for (int i = n - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }
}

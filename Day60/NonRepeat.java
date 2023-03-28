package Day60;

public class NonRepeat {

    public static Character helper(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(helper(s));
    }
}

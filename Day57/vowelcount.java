package Day57;

public class vowelcount {

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

    public static int countVowel(String s, int index) {
        int count = 0;
        for (int i = 0; i < index; i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                count++;
            }
        }
        for (int i = index; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "shouvik";

        int index = s.indexOf('v');
        int ans = countVowel(s, index);
        System.out.println(ans);
    }
}

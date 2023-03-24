package Day56;

public class halfString {
    public static void main(String[] args) {
        String s = "sassas";
        int h = s.length() / 2;
        int i = 0;
        boolean flag = true;
        while (i < h && h < s.length()) {
            if (s.charAt(i) != s.charAt(h)) {
                flag = false;
                break;
            }
            i++;
            h++;
        }
        if (flag == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

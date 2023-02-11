package Day33;

import java.util.*;

public class stringEncoding {
    public static void printEncodings(String str) {
        // Write your code here
        ArrayList<String> arr = new ArrayList<>();
        f(str, "", arr);
        Collections.sort(arr); // sorting ans as per question
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void f(String ques, String asf, ArrayList<String> arr) {
        if (ques.length() == 0) {
            arr.add(asf);
            return;
        }
        if (ques.charAt(0) == '0') {
            return;
        }

        char c = ques.charAt(0); // let from 25 to 2
        int integer_quiv = c - '0'; // '2' - '0'
        char mapping = (char) ('a' + integer_quiv - 1); // 'a'+2-1 -> 'a'+1 -> b (explicit)
        // left call
        f(ques.substring(1), asf + mapping, arr);

        // right call
        if (ques.length() >= 2) // words are with 26
        {
            int equiv = Integer.parseInt(ques.substring(0, 2)); // take only two no.
            if (equiv <= 26) {
                char mapp = (char) ('a' + equiv - 1);
                f(ques.substring(2), asf + mapp, arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
        sc.close();
    }
}

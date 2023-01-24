// Insert the first character in the beginning of string,  
// the second in the end,
// the third in the beginning,
//  fourth in the end, and so on.

package Day15;

import java.util.*;

public class StrangeString {
    static String strangeString(int n) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for (int i = 0; i < n; i++) // even index should insert at first
        { // odd index should append at last
            if (i % 2 == 0) {
                sb.insert(0, ch);
            } else {
                sb.append(ch);
            }
            ch++;
            if (ch > 'z') // if charecter become greater than z
            { // then reset it to from a
                ch = 'a';
            }
        }
        return sb.toString();

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
        input.close();
    }
}
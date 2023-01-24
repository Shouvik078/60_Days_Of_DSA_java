// have to form a string that contains the difference of ASCII values 
// of every two consecutive characters between those characters

package Day15;

import java.util.*;

public class ASCIIstring {

    public static String solution(String str) {
        int n = str.length();
        StringBuilder sb = new StringBuilder();

        sb.append(str.charAt(0)); // at first add 0 index char
        for (int i = 1; i < n; i++) {

            sb.append(str.charAt(i) - str.charAt(i - 1)); // add diff int
            sb.append(str.charAt(i)); // add ith index char
        }
        return sb.toString(); // covert StringBuilder to string & return
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
        scn.close();
    }
}

package Day32;

import java.util.*;

//  TC = O(2^N)       // SC = O(N)
public class SubsequenceOfString {
    static void printSubsequence(String s) {
        // Write your code here
        f(s, ""); // calling function
    }

    static void f(String ques, String asf) // ques = total string, asf=next string add or remove
    {
        if (ques.length() == 0) {
            System.out.print(asf + " ");
            return;
        }
        char c = ques.charAt(0); // hold the initial charecter
        String roq = ques.substring(1); // hold remaining charecter
        f(roq, asf + c); // taken
        f(roq, asf); // not taken
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
        sc.close();
    }
}

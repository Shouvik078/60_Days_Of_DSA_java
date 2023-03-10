package Day51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// TC = O(N)
class Solution {
    public boolean ExtraBrackets(String exp) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch != ')') {
                // ch is opening bracket or part of exp
                stack.push(ch);
            } else {
                if (stack.peek() == '(') {
                    // no exp inbetween
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                }
                // stack peek is opening bracket
                stack.pop();
            }
        }
        return false;
    }
}

public class ExtraBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution Obj = new Solution();
        if (Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

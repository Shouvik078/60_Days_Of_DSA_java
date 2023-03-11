package Day52;

import java.util.*;

class Solution {
    public void balancedBrackets(String s, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch != ')' && ch != '}' && ch != ']') {
                stack.push(ch);
            } else if (stack.size() > 0) {
                if (stack.peek() == '(' && ch == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && ch == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && ch == ']') {
                    stack.pop();
                }
            } else {
                System.out.println("NO");
                return;
            }
        }
        if (stack.size() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

public class CheckingParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
        sc.close();
    }
}
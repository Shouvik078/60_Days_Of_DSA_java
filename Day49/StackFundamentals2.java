package Day49;

import java.util.Stack;

public class StackFundamentals2 {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.add(5);
        s1.add(6);
        s1.add(11);
        s2.add(5);
        s2.add(6);
        s2.add(11);
        System.out.println(s1.equals(s2)); // check all element is equal or not True/false
        System.out.println(s1.get(1)); // return element
        System.out.println(s1.indexOf(11)); // return element 11 index - 2
    }
}

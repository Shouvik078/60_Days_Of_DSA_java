package Day48;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(5);
        s.push(7);
        System.out.println(s);
        s.pop();
        System.out.println(s);

    }
}

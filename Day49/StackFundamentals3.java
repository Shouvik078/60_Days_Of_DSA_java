package Day49;

import java.util.*;

public class StackFundamentals3 {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(3);
        s.add(6);
        s.add(8);
        System.out.println(s);
        s.clear(); // clear the stack by removing all elements
        System.out.println(s);

    }
}

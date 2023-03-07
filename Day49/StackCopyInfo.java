package Day49;

import java.util.*;

public class StackCopyInfo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(2);
        s.add(5);
        s.add(11);
        System.out.println(s);
        Stack<Integer> s2 = new Stack<>();
        s.copyInto(s2);
    }
}

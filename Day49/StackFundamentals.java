package Day49;

import java.util.*;

public class StackFundamentals {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(15);
        s.add(17);
        s.add(21);
        s.add(26);
        System.out.println(s);
        s.push(33);
        s.push(41);
        System.out.println(s);
        s.remove(1); // remove from stack as per index
        System.out.println(s);
        s.pop(); // pop means remove top element
        System.out.println(s);
        System.out.println(s.capacity());
        System.out.println(s);
        System.out.println(s.contains(33)); // 33 present in stack so, return true
        System.out.println(s.contains(52)); // 52 is not present in stack so, return false

    }
}

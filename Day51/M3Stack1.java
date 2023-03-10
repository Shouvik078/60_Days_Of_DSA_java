package Day51;

import java.util.Stack;

public class M3Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st + " " + st.peek());

        st.push(30);
        st.push(40);
        System.out.println(st + " " + st.peek() + " " + st.size());

        st.pop();
        System.out.println(st + " " + st.peek() + " " + st.size());
        System.out.println(st.isEmpty());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st + " " + st.size());
        System.out.println(st.isEmpty());

    }
}

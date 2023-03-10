package Day51;

import java.util.Stack;

public class pairOOPStack {

    static class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        Pair() {
            this.a = 0;
            this.b = 0;
        }

        public String toString() {
            return "(" + a + "," + b + ")";
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Pair> st2 = new Stack<>();
        st2.push(new Pair(1, 2));
        st2.push(new Pair(3, 4));
        st2.push(new Pair(5, 6));
        st2.push(new Pair(7, 8));

        System.out.println(st2);
        System.out.println(st2.peek() + " " + st2.size());
        st2.pop();
        System.out.println(st2);
        System.out.println(st2.peek() + " " + st2.size());
    }
}

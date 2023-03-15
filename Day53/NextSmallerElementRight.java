package Day53;

import java.util.Stack;

// Stack increasing order
// TC : O(N)
public class NextSmallerElementRight {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 3, 6, 4 };
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && arr[i] < arr[st.peek()]) {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() != 0) {
            ans[st.peek()] = -1;
            st.pop();
        }
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            System.out.print(ans[i] + " ");
        }
    }
}

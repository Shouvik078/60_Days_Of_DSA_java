package Day53;

import java.util.Stack;

// Stack is in decreasing order
// TC : O(N)
public class PreviousGreaterElement {
    public static void main(String[] args) {

        int[] arr = { 8, 2, 6, 5, 4, 7 };
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                ans[st.peek()] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        // element are left whoes previous element is not found
        while (st.size() > 0) {
            ans[st.peek()] = -1;
            st.pop();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

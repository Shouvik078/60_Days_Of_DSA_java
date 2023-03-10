package Day51;

import java.util.*;

import java.io.*;

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        // Write code here and print output
        Stack<Long> stack = new Stack<>();
        // for storing result
        long[] nger = new long[arr.length];
        // potential next greater element lies on right side of the Array
        // so traverse right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            long ele = arr[i];
            // check peek element of stack is smaller than me
            // there cant be my next greater , so remove them
            while (stack.size() > 0 && stack.peek() <= ele) {
                stack.pop();
            }
            // peek element is my next greater
            if (stack.size() > 0) {
                nger[i] = stack.peek();
            } else {
                nger[i] = -1;
            }
            // add myself to potentially nger for left element
            stack.push(ele);
        }
        return nger;
    }
}

public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)
            arr[i] = Long.parseLong(inputLine[i]);
        new Solution();
        long[] res = Solution.nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}

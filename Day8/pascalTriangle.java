package Day8;

import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTrianglee(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
            sc.close();
        }
    }

    public static ArrayList<ArrayList<Integer>> pascalTrianglee(int n) {
        // write code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> prev = new ArrayList<>();
        prev.add(1);
        // contents for row 1 ready
        ans.add(prev);
        if (n == 1) {
            return ans;
        }
        for (int i = 2; i <= n; i++) {
            // ith row
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j <= i - 2; j++) {
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;
        }
        return ans;
    }
}
package Day39;

import java.util.*;

class Solution {
    List<List<Integer>> findSubsets(ArrayList<Integer> arr) {
        // Write code here
        int n = arr.size();
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>(); // copy

        solve(0, n, arr, curr, ans);
        return ans;
    }

    public static void solve(int i, int n, ArrayList<Integer> arr, ArrayList<Integer> curr, List<List<Integer>> ans) {
        if (i == n) {
            if (curr.size() > 0) {
                ans.add(new ArrayList<Integer>(curr)); // path to
            }
            return;
        }

        curr.add(arr.get(i));
        solve(i + 1, n, arr, curr, ans);
        curr.remove(curr.size() - 1); // removing last element // not taken
        solve(i + 1, n, arr, curr, ans);
    }
}

public class PrintAllSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++)
            arr.add(sc.nextInt());
        Solution Obj = new Solution();
        List<List<Integer>> subset = Obj.findSubsets(arr);
        subset.forEach(Collections::sort);
        Collections.sort(subset, (o1, o2) -> {
            int min = Math.min(o1.size(), o2.size());
            for (int i = 0; i < min; i++) {
                if (o1.get(i) != o2.get(i)) {
                    return o1.get(i).compareTo(o2.get(i));
                }
            }
            return (o1.size() <= o2.size()) ? -1 : 1;
        });
        int k = subset.size();
        for (int i = 0; i < k; i++) {
            int m = subset.get(i).size();
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    System.out.print(subset.get(i).get(j) + "\n");
                } else {
                    System.out.print(subset.get(i).get(j) + " ");
                }
            }
        }
        sc.close();
    }
}

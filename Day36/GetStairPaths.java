// Get all stair paths to climb  and return ArrayList
package Day36;

import java.util.*;

public class GetStairPaths {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        input.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        // Basecase
        if (n == 0) // reached so, return empty string
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        if (n < 0) // over step only return empty arrayList
        {
            ArrayList<String> a = new ArrayList<>();
            return a;
        }

        // return an ArrayList consisting of paths to climb n stairs // let n=3
        ArrayList<String> a1 = getStairPaths(n - 1); // means n-1 stair jump left posible jump
        // 2 stair left.. either 11 or 2 jump
        ArrayList<String> a2 = getStairPaths(n - 2); // means n-2 stair jump left posible jump
        // 1 stair left.. 1 jump
        ArrayList<String> a3 = getStairPaths(n - 3); // means n-3 stair jump left posible jump
        // 0 stair left.. No jump
        ArrayList<String> ans = new ArrayList<>(); // ans of possible jump from stair
        // initial jump 1 step
        for (int i = 0; i < a1.size(); i++) {
            ans.add("1" + a1.get(i)); // 1+11 or 1+2
        }
        // initial jump 2 step
        for (int i = 0; i < a2.size(); i++) {
            ans.add("2" + a2.get(i)); // 2+1
        }
        for (int i = 0; i < a3.size(); i++) {
            ans.add("3" + a3.get(i)); // 3+"" = 3
        }
        return ans;
    }
}

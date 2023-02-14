package Day36;

import java.util.*;

public class GetSubsequences {
    public static ArrayList<String> generateSubsequences(String str) {
        // write your code here
        ArrayList<String> ans = new ArrayList<>();
        ans = f(str); // ans hold all subsequence of f
        ans.remove(""); // remove blank string As per Q.
        Collections.sort(ans); // Sorted lexically As per Q.
        return ans;
    }

    public static ArrayList<String> f(String s) { // basecase
        if (s.length() == 0) // s reached to first index recursivly
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        // r will return all subsequences from 1 th index,
        // let s= abc.. r will return all subsequence from bc
        ArrayList<String> r = f(s.substring(1));
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < r.size(); i++) {
            ans.add(s.charAt(0) + r.get(i)); // taken s first letter, let a
            ans.add(r.get(i)); // not taken a
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
            sc.close();
        }
    }
}

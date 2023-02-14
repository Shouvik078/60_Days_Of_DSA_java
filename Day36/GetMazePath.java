package Day36;

import java.util.*;

public class GetMazePath {
    public static ArrayList<String> allPossiblePaths(int n, int m) {
        // write code here
        ArrayList<String> ans = new ArrayList<>();
        generate(1, 1, n, m, ans, ""); // sr, sc = 1,1
        return ans;
    }

    public static void generate(int sr, int sc, int dr, int dc, ArrayList<String> ans, String asf) {
        if (sr == dr && sc == dc) {
            ans.add(asf);
            return; // bcz return type is void
        }
        if (sr > dr || sc > dc) {
            return;
        }
        generate(sr, sc + 1, dr, dc, ans, asf + "h1");
        generate(sr, sc + 2, dr, dc, ans, asf + "h2");
        generate(sr + 1, sc, dr, dc, ans, asf + "v1");
        generate(sr + 2, sc, dr, dc, ans, asf + "v2");
        generate(sr + 1, sc + 1, dr, dc, ans, asf + "d1");
        generate(sr + 2, sc + 2, dr, dc, ans, asf + "d2");

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        input.close();
        for (String str : result) {
            System.out.println(str);
        }

    }
}

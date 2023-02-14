package Day36;

import java.util.*;

public class OldPhoneKeypad {
    static ArrayList<String> OldPhone(int n, int[] keys) {
        // referencing 0-9 keypad to string
        String[] ref = { "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TU", "VWX", "YZ" };
        ArrayList<String> ans = generate(keys, 0, ref); // key, index, ref
        return ans;
    }

    public static ArrayList<String> generate(int[] keys, int i, String[] ref) { // Basecase
        if (i == keys.length) {
            ArrayList<String> ret = new ArrayList<>();
            ret.add(""); // blank string for concatination
            return ret;
        }
        // return an ArrayList consisting of all interPretations of key from index i to
        // till end
        ArrayList<String> res = generate(keys, i + 1, ref); // generate all interpetations of i+1
        String inter = ref[keys[i]];
        ArrayList<String> ans = new ArrayList<>();
        for (int j = 0; j < inter.length(); j++) // inter is string
        {
            for (int k = 0; k < res.size(); k++) // res is ArrayList
            {
                ans.add(inter.charAt(j) + res.get(k));
            }
        }
        return ans;

    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] keys = new int[n];
        for (int i = 0; i < n; ++i) {
            keys[i] = sc.nextInt();
        }
        ArrayList<String> ans = OldPhone(n, keys);
        for (String i : ans)
            System.out.print(i + " ");
        sc.close();
    }
}
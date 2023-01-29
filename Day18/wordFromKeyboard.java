package Day18;

import java.io.*;
import java.util.*;

public class wordFromKeyboard {

    static ArrayList<String> getStrings(ArrayList<String> arr) {
        String a = "qwertyuiop";
        String b = "asdfghjkl";
        String c = "zxcvbnm";
        ArrayList<String> ans = new ArrayList<String>();
        for (String i : arr) {
            int x = 0, y = 0, z = 0;
            for (int j = 0; j < i.length(); j++) {
                if (a.indexOf(i.charAt(j)) != -1)
                    x++;
                else if (b.indexOf(i.charAt(j)) != -1)
                    y++;
                else if (c.indexOf(i.charAt(j)) != -1)
                    z++;
            }
            if (x == i.length())
                ans.add(i);
            else if (y == i.length())
                ans.add(i);
            else if (z == i.length())
                ans.add(i);

        }
        return ans;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
            sc.close();
        }
    }
}

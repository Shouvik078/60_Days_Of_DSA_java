package Day56;

import java.util.*;
import java.util.Scanner;

public class AnagramString {

    public static boolean isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        s1 = Arrays.toString(arr1);
        s2 = Arrays.toString(arr2);
        if (s1.equals(s2))
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        // taking input from user
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2));
        sc.close();
    }
}

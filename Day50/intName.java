package Day50;

import java.util.*;

public class intName {

    public static void sayWord(int n, String[] arr) {

        if (n == 0)
            return;

        int digit = n % 10;
        n /= 10;
        sayWord(n, arr);
        System.out.println(arr[digit]);
    }

    public static void main(String[] args) {

        String arr[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        sayWord(n, arr);
    }
}

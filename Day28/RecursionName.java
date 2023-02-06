package Day28;

import java.util.*;

public class RecursionName {

    public static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Shouvik");
        printName(i + 1, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printName(1, n);
    }
}

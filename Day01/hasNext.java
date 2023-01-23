package Day01;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        boolean ans = sc.hasNextInt();
        System.out.println(ans);
        sc.close();
    }
}

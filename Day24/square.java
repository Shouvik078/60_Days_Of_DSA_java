package Day24;

import java.util.*;

public class square {

    public static int distance(int x1, int y1, int x2, int y2) {
        int d;
        d = (int) Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        return d;

    }

    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int d1 = distance(x1, y1, x2, y2);

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int d2 = distance(x1, y1, x3, y3);

        int x4 = sc.nextInt();
        int y4 = sc.nextInt();

        int d3 = distance(x1, y1, x4, y4);

        if (d1 == d2 && d2 == d3 && d1 == d3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
            ;
        }
        sc.close();

    }
}
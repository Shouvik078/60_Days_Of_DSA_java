package Day2;

import java.util.*;

public class markstopercentage {
    public static void main(String[] args) {
        System.out.println("Enter marks : ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Subject 1 marks : ");
        int s1 = sc.nextInt();

        System.out.print("Subject 2 marks : ");
        int s2 = sc.nextInt();

        System.out.print("Subject 3 marks : ");
        int s3 = sc.nextInt();

        System.out.print("Subject 4 marks : ");
        int s4 = sc.nextInt();

        System.out.print("Subject 5 marks : ");
        int s5 = sc.nextInt();
        sc.close();

        float ans = (float) (s1 + s2 + s3 + s4 + s5) / 5;
        System.out.println(ans);
    }

}

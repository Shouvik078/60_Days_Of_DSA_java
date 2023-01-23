package Day03;

import java.util.Scanner;

public class kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        sc.close();
        double miles = 0.6213 * km;
        System.out.println("KM To miles : " + miles);
    }

}

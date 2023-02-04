package Day26;

import java.util.*;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Operation = sc.nextInt();
        int n = 5; // 0101
        int pos = 1;
        sc.close();
        int BitMask = 1 << pos;
        if (Operation == 1) // means 0 to 1 // set operation
        {
            int newNumber = BitMask | n;
            System.out.println(newNumber);
        }

        else {
            int NotBitMask = ~BitMask; // clear operation
            int newNumber = NotBitMask & n;
            System.out.println(newNumber);
        }
    }
}

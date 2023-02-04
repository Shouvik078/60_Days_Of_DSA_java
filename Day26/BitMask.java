package Day26;

public class BitMask {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;

        int BitMask = 1 << pos;

        if ((BitMask & n) == 0) {
            System.out.println("Bit is Zero");
        } else {
            System.out.println("Bit is one");
        }
    }
}

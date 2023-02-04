package Day26;

public class BitSet {
    public static void main(String[] args) {
        int n = 5; // from 0101 to 0111
        int pos = 1;

        int BitMask = 1 << pos;

        System.out.println(BitMask | n);

    }

}

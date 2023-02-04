package Day26;

public class clearBit {
    public static void main(String[] args) {
        int n = 5; // 0101 from
        int pos = 2;
        int BitMask = 1 << pos;
        int notBitMask = (~BitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber); // 0001 to
    }
}

package Day26;

public class BinaryOnesComplement {
    public static void main(String[] args) {
        int A = 0b0101;
        int B = 0b0110;
        System.out.println(~A);
        System.out.println(Integer.toBinaryString(~A));
        System.out.println(~B);
        System.out.println(Integer.toBinaryString(~B));
    }
}

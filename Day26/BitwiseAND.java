package Day26;

public class BitwiseAND {
    public static void main(String[] args) {
        int A = 0b0101; // 4
        int B = 0b0110; // 5
        System.out.println(A & B); // 4
        System.out.println(Integer.toBinaryString(A & B));
    }
}

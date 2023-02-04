package Day26;

public class BinaryOR {
    public static void main(String[] args) {
        int A = 0b0101; // 4
        int B = 0b0110; // 5
        System.out.println(A | B); // return as integer 7
        System.out.println(Integer.toBinaryString(A | B)); // return as binary
    }
}

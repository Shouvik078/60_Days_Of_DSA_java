package Day57;

public class subsequence {

    public static void generate(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println(output + " ");
            return;
        }
        char ch = input.charAt(index);

        generate(input, output + ch, index + 1);
        generate(input, output, index + 1);
    }

    public static void main(String[] args) {
        String input = "abc";

        generate(input, "", 0);
    }
}

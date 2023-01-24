package Day15;

public class splitInCAPITAL {
    public static void main(String[] args) {
        String str = "IAmAJavaProgrammer";
        String[] arr = str.split("(?=[A-Z])");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
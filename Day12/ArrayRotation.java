package Day12;

public class ArrayRotation {
    public static void main(String[] args) {

        int[] arr = { 8, 5, 3, 6, 2 };
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = 1; i < n - 1; i++) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (var x : arr) {
            System.out.print(x + " ");
        }
    }
}

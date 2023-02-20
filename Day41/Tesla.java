package Day41;

public class Tesla {

    public static boolean f(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 1, 2, 8, 4, 3 };
        if (f(arr, 10)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}

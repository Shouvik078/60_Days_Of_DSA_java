package Day11;

public class bubblesortusingFlag {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 22, 7, 12 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Before sorting 8 5 7 3 2

        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // after sorting 2 3 5 7 8
        }
    }
}

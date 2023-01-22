package Day11;

public class selectionsort1 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 4 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[mini] > arr[j]) {
                    mini = j;
                }
            }
            // swap minimum index value with i
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

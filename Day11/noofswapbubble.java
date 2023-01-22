package Day11;

public class noofswapbubble {
    public static void main(String[] args) {

        int arr[] = { 6, 4, 1 };
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
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
        System.out.println(count);
        System.out.println(arr[0]);
        System.out.println(arr[n - 1]);

    }
}

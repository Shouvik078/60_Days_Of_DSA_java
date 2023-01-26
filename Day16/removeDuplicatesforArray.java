package Day16;

public class removeDuplicatesforArray {

    public static int removeDuplicateElements(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) { // loop till before last element
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // add last element
        // change in original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 20 };
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        // printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }

}

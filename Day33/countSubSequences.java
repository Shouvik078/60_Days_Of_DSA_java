package Day33;

public class countSubSequences

{
    public static int printS(int ind, int s, int sum, int[] arr, int n)

    {
        if (ind == n) {
            if (s == sum)
                return 1;
            else
                return 0;
        }
        s = s + arr[ind];
        int l = printS(ind + 1, s, sum, arr, n);
        s = s - arr[ind];
        int r = printS(ind + 1, s, sum, arr, n); // not taken
        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = 3; // arr length
        int sum = 2; // target

        System.out.println(printS(0, 0, sum, arr, n));
    }
}

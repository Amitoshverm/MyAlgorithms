package Subarrays.prefix;

public class LeftMax {

    //* max array from 0 --> i
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 3, 8, -1, 3, 2};
        int[] pfArr = res(arr);
        System.out.println(pfArr[3]);
    }
    static int[] res(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pf[i] = Math.max(pf[i-1], arr[i]);
        }
        return pf;
    }
}

package Subarrays.prefix;

public class RightMax {

    // * max from i --> n-1
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 3, 8, -1, 3, 2};
        int[] pfArr = res(arr);
        System.out.println(pfArr[0]);
    }

    // * this goes right to left
    public static int[] res(int[] arr){
        int n = arr.length;
        int[] pf = new int[n];
        pf[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            pf[i] = Math.max(pf[i+1], arr[i]);
        }
        return pf;
    }
}

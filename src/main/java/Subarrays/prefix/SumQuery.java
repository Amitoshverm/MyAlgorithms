package Subarrays.prefix;

import java.util.Scanner;

public class SumQuery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        int[] arr = {-2, 6, 7, 1, 2, 4, 5};

        while(q != 0) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(res(arr, l, r));
            q--;
        }

    }
    public static int res(int[] arr, int l, int r) {

        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pf[i] = pf[i-1] + arr[i];
        }
        return pf[r] - pf[l] + arr[l];
    }
}

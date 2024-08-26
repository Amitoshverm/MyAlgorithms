package Subarrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-3, 4, -2, 5, 3, -2, 8, 2, -1};
        int[] arr1 = {3, -2, 4, -1, 2, 6};
        System.out.println((max(arr, 5)));
        System.out.println(contribution(arr1));
    }
    /*
    * max subarray sum with length
    * sliding window can only perform only when window size is given
     */
    static int max(int [] arr, int k) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;

        for (int i = 1; i < n-k; i++) {
            int j = i + k - 1;
            sum = sum + arr[j] - arr[i-1];
            max = Math.max(max, sum);
        }
        return max;
    }

    static int contribution(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int ans = arr[i] * ((i + 1) * (n-i));
            sum += ans;
        }
        return sum;
    }

}

package Subarrays.prefix;

public class ClosestMinMax {
    public static void main(String[] args) {

        int[] arr = {2, 2, 6, 4, 5, 5, 2, 6, 4, 1};
        int ans = sol(arr);
        System.out.println(ans);

    }
    // ! find minimum lenght subarray which contains both max and min element of the array

    // * min and max would be present at boundary for minimum length
    // * we will start go from right to left as in 'AG Pair' ques for finding a pair length

    public static int sol(int[] arr) {
        int n = arr.length;
        int ans = n;
        int min_i = 2*n;
        int max_i = 2*n;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        // get min and max element
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for (int i = n-1; i >= 0; i--) {
            if (arr[i] == min) {
                ans = Math.min(ans, max_i - i + 1);
                min_i = i;
            }
            else if (arr[i] == max) {
                ans = Math.min(ans, min_i - i + 1);
                    max_i = i;
            }
        }
        return ans;
    }
}

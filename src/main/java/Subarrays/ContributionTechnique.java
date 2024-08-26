package Subarrays;

public class ContributionTechnique {

    // * contribution of each element
    public static void main(String[] args) {
        int[] arr = {3, -2, 4, -1, 2, 6};
        System.out.println(contribution(arr));
    }
    // * sum of all sub array sum

    public static int contribution(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int ans = arr[i] * (i + 1) * (n - i);
            sum += ans;
        }
        return sum;
    }
}

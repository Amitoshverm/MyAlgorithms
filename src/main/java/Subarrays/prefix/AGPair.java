package Subarrays.prefix;

public class AGPair {
    public static void main(String[] args) {

    }
    static int res(String A) {
        int n = A.length();
        A.toUpperCase();
        int c = 0, ans = 0;
        for (int i = n-1; i >= 0; i--) {
            if (A.charAt(i) == 'g') {
                c++;
            }
            else if (A.charAt(i) == 'a') {
                ans += c;
            }
        }
        return ans;
    }
}

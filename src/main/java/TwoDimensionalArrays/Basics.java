package TwoDimensionalArrays;

public class Basics {
    public static void main(String[] args) {
        int[][] arr = { {3, -1, 2, 6, 1},
                        {3, 2, 1, 7, -3},
                        {6, -3, 4, -3, -2},
                         {10, 2, 3, -7, 3} };
        int n = arr.length;
        int m = arr[0].length;
//        System.out.println(n +" ," +m);

        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                s += arr[i][j];
            }
            System.out.println(s);
        }

        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                s += arr[j][i];
            }
            System.out.println(s);
        }
    }
}
// * iteration row wise and column wise

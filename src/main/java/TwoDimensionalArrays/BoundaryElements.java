package TwoDimensionalArrays;

public class BoundaryElements {
    public static void main(String[] args) {
        int [][] arr = {{-3, 2, 1, 6, 4},
                        {2, 3, -1, 6, 2},
                        {3, 9, 8, -1, 2},
                        {3, -2, 4, 6, 1},
                        {9, -3, 1, 2, -1}};

        int n = arr.length;
        int m = arr[0].length;
        int i = 0, j = 0;
        for (j = 0; j < m-1; j++) {
            System.out.print(arr[i][j] + " ");
        }

        System.out.println();
        for (i = 0; i < n - 1; i++) {
            System.out.print(arr[i][j]+ " ");
        }

        System.out.println();
        for (j = m - 1; j > 0; j--) {
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
        for (i = n - 1; i > 0; i--) {
            System.out.print(arr[i][j] + " ");
        }
    }
}

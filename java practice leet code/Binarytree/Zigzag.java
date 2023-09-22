public class Zigzag {
    public static int r, c;

    public static void zig(int[][] arr) {
        for (int k = 0; k < r; k++) {
            System.out.print(arr[k][0] + " ");
            int i = k - 1;
            int j = 1;
            while (isvalid(i, j)) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();

        }
        for (int k = 1; k < c; k++) {
            System.out.print(arr[r - 1][k] + " ");
            int i = r - 2;
            int j = k + 1;
            while (isvalid(i, j)) {
                System.out.print(arr[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }

    }

    public static boolean isvalid(int i, int j) {

        if (i < 0 || i >= r || j >= c || j < 0) {
            return false;

        }
        return true;
    }

    public static void main(String[] args) {
        int m[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
        r = m.length;
        c = m[0].length;
        zig(m);

    }

}

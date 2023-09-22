public class Spiralmatrix {
    public static void spiral(int[][] matx) {
        int minr = 0;
        int maxr = matx.length;
        int minc = 0;
        int maxc = matx[0].length;
        int totl = maxc * maxr;
        int cout = 0;

        while (cout < totl) {

            for (int j = minc, i = minc; j < maxc; j++) {
                System.out.print("->" + matx[i][j] + " ");
                cout++;
            }
            minr++;

            for (int i = minr, j = maxc - 1; i < maxr; i++) {
                System.out.print("->" + matx[i][j] + " ");
                cout++;
            }
            maxc--;

            for (int j = maxc - 1, i = maxr - 1; j >= minc; j--) {
                System.out.print("->" + matx[i][j] + " ");
                cout++;
            }
            maxr--;
            for (int i = maxr - 1, j = minc; i >= minr; i--) {
                System.out.print("->" + matx[i][j] + " ");
                cout++;
            }
            minc++;
        }

    }

    public static void main(String[] args) {
        int[][] s = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        spiral(s);
    }

}

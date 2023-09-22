import java.util.Arrays;

public class Nextpermutation {
    public static void permutation(int[] n) {
        int i = n.length - 2;
        while (i >= 0 && n[i] >= n[i + 1]) {
            i--;
        }
        if (i > 0) {
            int j = n.length - 1;
            while (j > 0 && n[j] <= n[i]) {
                j--;

            }
            swap(n, i, j);
        }
        reverse(n, i + 1);
    }

    public static void swap(int[] n, int i, int j) {
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    public static void reverse(int[] n, int st) {
        int i = st;
        int j = n.length - 1;
        while (i < j) {
            swap(n, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 7, 6, 5, 4 };
        permutation(num);
        System.out.print(Arrays.toString(num));
    }

}

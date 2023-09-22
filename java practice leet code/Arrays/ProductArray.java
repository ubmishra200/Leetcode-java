import java.util.Arrays;

public class ProductArray {
    public static void product(int[] num) {
        int n = num.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] * num[i - 1];
        }
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * num[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = left[i] * right[i];
        }
        String a = Arrays.toString(result);
        System.out.println(a);

    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4 };
        product(n);
    }
}

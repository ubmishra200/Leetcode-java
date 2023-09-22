public class Trapingwater {
    public static int trap(int[] num) {
        int n = num.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int trap = 0;
        left[0] = num[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(num[i], left[i - 1]);
        }
        right[n - 1] = num[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], num[i]);

        }
        for (int i = 0; i < n; i++) {
            trap += Math.min(right[i], left[i]) - num[i];
        }
        return trap;

    }

    public static void main(String[] args) {
        int[] n = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("water is full si" + trap(n));
    }
}

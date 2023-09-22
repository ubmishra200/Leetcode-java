public class Maxsum {
    public static int sum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int temps = 0;
        for (int i = 0; i < arr.length; i++) {
            temps += arr[i];
            if (temps > max) {
                max = temps;

            }
            if (temps < 0) {
                temps = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] n = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(sum(n));
    }

}

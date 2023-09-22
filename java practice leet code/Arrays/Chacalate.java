import java.util.Arrays;

public class Chacalate {
    public static int Distri(int[] st, int n) {
        Arrays.sort(st);
        int minch = Integer.MAX_VALUE;
        for (int i = 0; i + n - 1 < st.length; i++) {
            int diff = st[i + n - 1] - st[i];
            if (diff < minch) {
                minch = diff;
            }

        }
        return minch;
    }

    public static void main(String[] args) {
        int[] ch = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        int m = 7;
        System.out.println(Distri(ch, m));
    }
}

public class Bubble {
    public void sort(int[] n, int ord) {
        if (n == null || ord < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        for (int i = 0; i < ord; i++) {
            for (int j = n.length - 1; j > 0; j--) {
                int temp = n[j];
                n[j] = n[j - 1];
                n[j - 1] = temp;
            }

        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }
    }

    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] n = { 0, 2, 4, 3, 5, 6 };
        int r = 2;
        b.sort(n, r);
    }

}

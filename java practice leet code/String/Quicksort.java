
public class Quicksort {
    public static void quicksort(int[] n, int low, int high) {
        if (low < high) {
            int pidx = pivot(n, low, high);
            quicksort(n, low, pidx - 1);
            quicksort(n, pidx + 1, high);
        }

    }

    public static int pivot(int[] n, int low, int high) {
        int pi = n[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (n[j] < pi) {
                i++;
                int temp = n[i];
                n[i] = n[j];

                n[j] = temp;
            }

        }
        i++;
        int temp = n[i];
        n[i] = pi;
        n[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] n = { 3, 5, 4, 8, 6, 1 };
        quicksort(n, 0, n.length - 1);
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]);
        }
    }

}

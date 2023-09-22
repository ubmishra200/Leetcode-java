public class Insertionsort {
    public static void sort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;

        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 6, 9 };
        sort(arr);
    }

}

public class Nextpermutatio {
    public static void permuta(int[] dr) {
        // 123654
        int i = dr.length - 2;
        while (i >= 0 && dr[i] > dr[i + 1]) {
            i--;

        }
        if (i >= 0) {
            int j = dr.length - 1;
            while (dr[j] <= dr[i]) {
                j--;
            }
            swap(dr, i, j);
        }
        reverse(dr, i + 1);

    }

    public static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;

    }

    public static void reverse(int[] data, int i) {
        int j = data.length - 1;
        while (i < j) {
            swap(data, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 6, 5, 4 };
        permuta(arr);
        for (int ar : arr) {
            System.out.print(ar);
        }
    }

}

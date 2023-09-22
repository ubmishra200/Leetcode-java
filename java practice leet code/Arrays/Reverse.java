public class Reverse {
    void rotate(int[] n, int ord) {

        if (n == null || ord < 0 || n.length < ord) {
            throw new IllegalArgumentException("white code");
        }
        int a = n.length - ord;
        reverse(n, 0, a - 1);
        reverse(n, a, n.length - 1);

        reverse(n, 0, n.length - 1);

    }

    static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) {

            return;
        }
        while (left < right) {
            int temp = 0;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < right; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5 };
        int ord = 2;
        Reverse r = new Reverse();
        r.rotate(n, ord);
    }

}

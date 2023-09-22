
import java.util.Arrays;

public class Mergesort {
    public static void srt(int[] num, int st, int end) {
        if (st >= end) {
            return;
        }
        int mid = st + (end - st) / 2;
        srt(num, st, mid);
        srt(num, mid + 1, end);
        conquer(num, st, mid, end);

    }

    public static void conquer(int[] n, int st, int mid, int end) {
        int[] temp = new int[end - st + 1];
        int arr1 = st;
        int arr2 = mid + 1;
        int temarr = 0;
        while (arr1 <= mid && arr2 <= end) {
            if (n[arr1] <= n[arr2]) {
                temp[temarr++] = n[arr1++];

            } else {
                temp[temarr++] = n[arr2++];
            }
        }
        while (arr1 <= mid) {
            temp[temarr++] = n[arr1++];

        }
        while (arr2 <= end) {
            temp[temarr++] = n[arr2++];

        }
        for (int i = 0, j = st; i < temp.length; i++, j++) {
            n[j] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] str = { 2, 3, 5, 7, 1 };
        srt(str, 0, str.length - 1);
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
    }

}

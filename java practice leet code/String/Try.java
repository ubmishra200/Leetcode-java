import java.util.Arrays;

public class Try {

    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;

        int n = arr.length;
        int[] temp = new int[n];

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(arr, leftStart, mid, rightEnd, temp);
            }
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        // Same merge method as in the recursive approach
        // (provided in the first code snippet)
    }

    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

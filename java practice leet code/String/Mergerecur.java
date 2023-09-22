public class Mergerecur {
    public static void mergesorts(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];
        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + 1 + j];

        }
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftarr[i] <= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;

        }
        while (i < n1) {
            arr[k++] = leftarr[i++];
        }
        while (j < n2) {
            arr[k++] = rightarr[j++];
        }

    }

    public static void merges(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            merges(arr, left, mid);
            merges(arr, mid + 1, right);
            mergesorts(arr, left, mid, right);
        }

    }

    public static void main(String[] args) {
        int[] mer = { 4, 5, 7, 15, 8, 2, 6, 18, 20 };
        int left = 0;
        int right = mer.length - 1;
        merges(mer, left, right);
        for (int m : mer) {
            System.out.print(m + " ,");

        }
    }
}

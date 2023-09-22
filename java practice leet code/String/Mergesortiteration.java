public class Mergesortiteration {
    public static void merge(int[] arr, int left, int mid, int right) {
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

    public static void mersort(int[] arr) {
        int n = arr.length;
        for (int currsize = 1; currsize <= n - 1; currsize = 2 * currsize) {
            for (int left = 1; left < n - 1; left += 2 * currsize) {
                int middle = Math.min(left + currsize - 1, n - 1);
                int right = Math.min(left + 2 * currsize, n - 1);
                merge(arr, left, middle, right);

            }
        }

    }

    public static void main(String[] args) {
        int[] sot = { 5, 6, 1, 7, 8, 10, 2, 9, 3 };
        mersort(sot);
        for (int m : sot) {
            System.out.print(m + ",");
        }

    }

}

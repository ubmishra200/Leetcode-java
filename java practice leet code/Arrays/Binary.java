public class Binary {
    public static int search(int[] n, int tar) {
        int st = 0;
        int end = n.length - 1; // Fix 1: Initialize 'end' correctly
        int mid = (st + end) / 2;

        while (st <= end) {
            mid = (st + end) / 2;

            if (tar == n[mid]) { // Fix 2: Change condition to compare 'tar' with 'n[mid]'
                return mid;
            }

            if (n[st] <= n[mid]) {
                if (n[st] <= tar && n[mid] >= tar) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (n[end] >= tar && n[mid] <= tar) { // Fix 3: Change condition to compare 'tar' with 'n[mid]'
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n[] = { 4, 5, 6, 7, 0, 1, 2 };
        int tar = 0;
        System.out.println(search(n, tar));
    }
}

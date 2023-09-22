public class Longestsubstringwithoutrepeating {
    public static int check(String str, int k) {
        int[] arr = new int[26];
        int largestcount = 0, beg = 0, maxlen = 0;
        for (int end = 0; end < str.length(); end++) {
            arr[str.charAt(end) - 'A']++;
            largestcount = Math.max(largestcount, arr[str.charAt(end) - 'A']);
            if (end - beg + 1 - largestcount > k) {
                arr[str.charAt(beg) - 'A']--;
                beg--;
            }
            maxlen = Math.max(maxlen, end - beg + 1);
        }
        return maxlen;

    }

    public static void main(String[] args) {
        String str = "ABAB";
        int k = 2;
        System.out.println(check(str, k));
    }

}

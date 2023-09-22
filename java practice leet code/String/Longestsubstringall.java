public class Longestsubstringall {
    public static void palidrome(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++) {
            expand(str, i, i);
            expand(str, i, i + 1);

        }
    }

    public static void expand(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            String pali = str.substring(left, right + 1);
            System.out.print("," + pali);
            left--;
            right++;

        }

    }

    public static void main(String[] args) {
        String s = "aaa";
        palidrome(s);
    }

}

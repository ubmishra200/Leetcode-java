public class Palidrome {
    public static void pali(String s) {
        int maxPalindrome = 0;
        String res = null;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                int len = j - i;
                String curr = s.substring(i, j);
                if (isPalindrome(curr)) {
                    if (len > maxPalindrome) {
                        res = curr;
                        maxPalindrome = len;
                    }
                }
            }
        }
        System.out.println(res);
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ababa";
        pali(s);
    }
}

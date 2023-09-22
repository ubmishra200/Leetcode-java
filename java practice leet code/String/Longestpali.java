public class Longestpali {
    public static String palidrome(String str) {
        int maxlen = 0;
        String longest = "";
        if (str.length() < 2) {
            return str;

        }
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String substr = str.substring(i, j);
                if (ispali(substr) && substr.length() >= maxlen) {
                    maxlen = substr.length();
                    longest = substr;
                }

            }
        }
        return longest;
    }

    private static boolean ispali(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "babab";
        System.out.println(palidrome(s));

    }

}

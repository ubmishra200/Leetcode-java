/**
 * Palidram
 */
public class Palidram {
    public static boolean check(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = s.length();
        if (n == 0 || n == 2) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(check(s));
    }
}
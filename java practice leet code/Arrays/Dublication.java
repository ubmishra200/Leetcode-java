
import java.util.HashSet;

public class Dublication {
    public static boolean check(int[] s) {
        HashSet<Integer> se = new HashSet<Integer>();
        for (int i = 0; i < s.length; i++) {
            if (se.contains(s[i])) {
                return true;
            }
            se.add(s[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] s = { 2, 4, 5, 4, 6, 5 };
        System.out.println(check(s));
    }
}

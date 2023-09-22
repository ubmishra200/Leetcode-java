import java.util.Arrays;

public class Anagram {
    public static boolean check(String s, String t) {
        char[] st = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tt);
        return Arrays.equals(st, tt);   
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramana";
        System.out.println(check(s, t));
    }

}

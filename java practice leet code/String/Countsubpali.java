public class Countsubpali {

    // wrong answer
    public static void palie(String str) {
        int n = str.length() - 1;
        int c = 0;
        for (int i = 0; i < n; i++) {
            c += expand(str, i, i);
            c += expand(str, i, i + 1);
        }
        System.out.println(c);
    }

    public static int expand(String s, int start, int end) {

        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {

            start--;
            end++;
        }
        return end - start + 1;

    }

    public static void main(String[] args) {
        String st = "abc";
        palie(st);
    }

}

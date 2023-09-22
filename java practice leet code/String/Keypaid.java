public class Keypaid {
    public static String check(String[] str, String ar) {
        String out = " ";
        int n = ar.length() - 1;

        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(ar.charAt(i));
            if (ch == ' ') {
                out += "0";

            } else {

                int pos = ch - 'a';
                out += str[pos];
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String str[] = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };
        String arr = "uday";
        System.out.println(check(str, arr));

    }
}

import java.util.Arrays;

public class Longestcommonpre {
    public static String check(String[] arr) {
        StringBuilder vs = new StringBuilder();
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length - 1];
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return vs.toString();
            }
            vs.append(first.charAt(i));
        }
        return vs.toString();

    }

    public static void main(String[] args) {
        String[] st = { "flow", "flower", "fly" };
        System.out.println(check(st));
    }
}
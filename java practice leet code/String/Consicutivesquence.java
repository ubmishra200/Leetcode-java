import java.util.Stack;

class Consicutivesquence {
    public static String checks(String str) {
        Stack<Character> stck = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (stck.isEmpty() || curr != stck.peek()) {
                stck.push(curr);
                sb.append(curr);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "aabbaaabc";
        System.out.println(checks(s));
    }
}
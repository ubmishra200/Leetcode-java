import java.util.*;

public class Rpn {
    public static void main(String[] args) {
        String[] arr = new String[] { "2", "1", "+", "3", "*" };
        System.out.println(Rotatepolish(arr));
    }

    public static int Rotatepolish(String[] tocans) {
        int returnval = 0;
        String opt = "*_+/";
        Stack<String> stack = new Stack<String>();
        for (String t : tocans) {
            if (!opt.contains(t)) {
                stack.push(t);

            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(a / b));
                        break;

                }
            }
        }
        returnval = Integer.valueOf(stack.pop());
        return returnval;
    }

}

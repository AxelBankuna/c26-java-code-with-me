import java.util.Stack;

public class Kata {
    public static boolean validateBraces(String braces) {
        String[] bracesArray = braces.split("");

        Stack<String> stack = new Stack<>();

        for (String i : bracesArray) {
            if (i.equals("(") || i.equals("{") || i.equals("[")) {
                stack.push(i);
            } else {
                if (i.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                    continue;
                }
                if (i.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                    continue;
                }
                if (i.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
        System.out.println(stack);
        return (stack.empty());
    }

    public static void main(String[] args) {
        System.out.println(validateBraces("[({})]"));
    }
}

// }}}}}
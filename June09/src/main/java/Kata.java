import java.util.Stack;

public class Kata {
    public static boolean validateBraces(String braces) {
        String[] bracesArray = braces.split("");

        Stack<String> stack = new Stack<>();

        for (String i : bracesArray) {
            if (i.equals("(") || i.equals("{") || i.equals("[")) {
                stack.push(i);
            }
            if (i.equals("]") && stack.peek().equals("[")) {
                stack.pop();
                continue;
            }
            if (i.equals(")") && stack.peek().equals("(")) {
                stack.pop();
                continue;
            }
            if (i.equals("}") && stack.peek().equals("{")) {
                stack.pop();
            }
        }

        System.out.println("left in the stack: " + stack);
        return (stack.empty());
    }

    public static void main(String[] args) {
        System.out.println(validateBraces("()"));
    }
}

// }}}}}
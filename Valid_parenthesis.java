import java.util.Stack;

public class Valid_parenthesis {
    public static boolean checkValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        // Test the Valid Parenthesis checker
        String test = "{[()]}";
        boolean isValid = checkValidParenthesis(test);
    }
}
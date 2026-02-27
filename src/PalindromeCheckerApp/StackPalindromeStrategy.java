import java.util.Stack;

public class StackPalindromeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            if (!stack.pop().equals(text.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

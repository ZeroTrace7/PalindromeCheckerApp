import java.util.ArrayDeque;
import java.util.Deque;
public class DequePalindromeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}


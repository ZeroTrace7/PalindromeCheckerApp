import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
public class UseCase13PalindromeCheckerApp {
    private static final int ITERATIONS = 10000;
    public static void main(String[] args) {
        String text = "racecarannakayak";
        benchmark("Two-pointer", text, UseCase13PalindromeCheckerApp::isPalindromeTwoPointer);
        benchmark("Stack", text, UseCase13PalindromeCheckerApp::isPalindromeStack);
        benchmark("Deque", text, UseCase13PalindromeCheckerApp::isPalindromeDeque);
        benchmark("Recursion", text, UseCase13PalindromeCheckerApp::isPalindromeRecursiveWrapper);
    }
    private static void benchmark(String name, String text, PalindromeTest test) {
        long start = System.nanoTime();
        boolean result = false;
        for (int i = 0; i < ITERATIONS; i++) {
            result = test.test(text);
        }
        long end = System.nanoTime();
        double ms = (end - start) / 1_000_000.0;
        System.out.printf("%s -> %s | Time: %.3f ms (%d iterations)%n",
                name,
                result ? "palindrome" : "not palindrome",
                ms,
                ITERATIONS);
    }
    private static boolean isPalindromeTwoPointer(String text) {
        if (text == null) {
            return false;
        }
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    private static boolean isPalindromeStack(String text) {
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
    private static boolean isPalindromeDeque(String text) {
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
    private static boolean isPalindromeRecursiveWrapper(String text) {
        if (text == null) {
            return false;
        }
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }
    private static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(text, left + 1, right - 1);
    }
    private interface PalindromeTest {
        boolean test(String text);
    }
}


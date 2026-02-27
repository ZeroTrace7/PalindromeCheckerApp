public class UseCase9PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "racecar";

        boolean isPalindrome = isPalindrome(text);

        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String text) {
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
}

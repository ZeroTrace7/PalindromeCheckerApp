public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "Never odd or even";

        String normalized = text.toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome = isPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

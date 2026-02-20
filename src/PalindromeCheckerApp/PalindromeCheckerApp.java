import java.util.Scanner;

public class PalindromeCheckerApp {
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "1.0";

    public static void main(String[] args) {
        System.out.println("Welcome to " + APP_NAME);
        System.out.println("Version " + VERSION);
        System.out.println("Type text to check. Type 'exit' to quit.");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nEnter text: ");
                String input = scanner.nextLine();

                if (input.trim().equalsIgnoreCase("exit")) {
                    System.out.println("Exiting " + APP_NAME + ".");
                    break;
                }

                if (input.trim().isEmpty()) {
                    System.out.println("Input cannot be empty. Try again.");
                    continue;
                }

                String normalized = normalize(input);
                if (normalized.isEmpty()) {
                    System.out.println("Please enter at least one letter or number.");
                    continue;
                }

                if (isPalindrome(normalized)) {
                    System.out.println("Result: \"" + input + "\" is a palindrome.");
                } else {
                    System.out.println("Result: \"" + input + "\" is not a palindrome.");
                }
            }
        }
    }

    private static String normalize(String text) {
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                clean.append(Character.toLowerCase(ch));
            }
        }
        return clean.toString();
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

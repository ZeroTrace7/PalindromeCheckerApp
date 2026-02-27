public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "level";
        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.checkPalindrome(text);

        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }
}

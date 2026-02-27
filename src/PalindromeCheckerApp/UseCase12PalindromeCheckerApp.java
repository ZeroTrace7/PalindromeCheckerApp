public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "level";
        PalindromeStrategy strategy = new DequePalindromeStrategy();
        PalindromeService service = new PalindromeService(strategy);
        boolean isPalindrome = service.checkPalindrome(text);
        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }
}


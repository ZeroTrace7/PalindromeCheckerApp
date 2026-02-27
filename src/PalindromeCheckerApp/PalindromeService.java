public class PalindromeService {
    private final PalindromeStrategy strategy;
    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
    public boolean checkPalindrome(String text) {
        return strategy.isPalindrome(text);
    }
}


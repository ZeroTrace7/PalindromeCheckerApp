public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "madam";
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reversedWord)) {
            System.out.println("Result: " + word + " is a palindrome.");
        } else {
            System.out.println("Result: " + word + " is not a palindrome.");
        }
    }
}

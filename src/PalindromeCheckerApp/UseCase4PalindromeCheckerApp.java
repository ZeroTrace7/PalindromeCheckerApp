public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
        String text = "radar";
        char[] characters = text.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }
}

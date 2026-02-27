public class PalindromeChecker {
    public boolean checkPalindrome(String text) {
        if (text == null) {
            return false;
        }

        char[] characters = text.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            if (characters[left] != characters[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

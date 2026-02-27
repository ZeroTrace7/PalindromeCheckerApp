public class UseCase8PalindromeCheckerApp {
    private static class Node {
        char value;
        Node next;

        Node(char value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        String text = "civic";

        if (text.length() <= 1) {
            System.out.println("Result: " + text + " is a palindrome.");
            return;
        }

        Node head = buildList(text);

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfStart = (fast != null) ? slow.next : slow;
        Node reversedSecondHalf = reverse(secondHalfStart);

        boolean isPalindrome = true;
        Node left = head;
        Node right = reversedSecondHalf;
        while (right != null) {
            if (left.value != right.value) {
                isPalindrome = false;
                break;
            }
            left = left.next;
            right = right.next;
        }

        if (isPalindrome) {
            System.out.println("Result: " + text + " is a palindrome.");
        } else {
            System.out.println("Result: " + text + " is not a palindrome.");
        }
    }

    private static Node buildList(String text) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < text.length(); i++) {
            Node node = new Node(text.charAt(i));
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        return head;
    }

    private static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

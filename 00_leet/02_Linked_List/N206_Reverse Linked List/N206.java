package N206;
import java.util.*;

public class N206 {
    public static void main(String[] args) {
        // Example usage
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original List: " + listToString(head));

        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        System.out.println("Reversed List: " + listToString(reversedHead));
    }

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution class
    static class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            return prev;
        }
    }

    // Helper method to create a linked list from an array
    private static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to convert a linked list to a string
    private static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode current = head;

        while (current != null) {
            sb.append(current.val).append(" -> ");
            current = current.next;
        }

        sb.append("null");
        return sb.toString();
    }
}

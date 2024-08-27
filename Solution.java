import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    ListNode  reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes:");
            int n = scanner.nextInt();
            
            if (n <= 0) {
                System.out.println("The linked list is empty.");
                scanner.close();
                return;
            }
            
            System.out.println("Enter the values of the nodes:");
            ListNode head = new ListNode(scanner.nextInt());
            ListNode current = head;
            for (int i = 1; i < n; i++) {
                current.next = new ListNode(scanner.nextInt());
                current = current.next;
            }
            
            System.out.println("Original list:");
            printList(head);
            
            Solution solution = new Solution();
            ListNode reversedHead = solution.reverseList(head);
            
            System.out.println("Reversed list:");
            printList(reversedHead);
        }
    }

    // Utility method to print a linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

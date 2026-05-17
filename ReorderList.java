import java.util.*;

// Definition for singly-linked list
class ListNode {
    int val; // Value stored in the node
    ListNode next; // Pointer to the next node

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReorderList {

    // Function to reorder the list
    public void reorderList(ListNode head) {
        // Step 1: Base case check
        if (head == null) {
            return; // If list is empty, nothing to do
        }

        // Step 2: Find the middle using slow/fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Move slow by 1 step, fast by 2 steps
        // When fast reaches end, slow will be at middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse the second half of the list
        ListNode temp, curr = slow, prev = null;
        while (curr != null) {
            temp = curr.next; // Save next node
            curr.next = prev; // Reverse pointer
            prev = curr; // Move prev forward
            curr = temp; // Move curr forward
        }
        // Now 'prev' points to the head of reversed second half

        // Step 4: Merge two halves
        ListNode first = head; // Start of first half
        ListNode second = prev; // Start of reversed second half

        // Weave nodes together: first → second → first → second...
        while (second.next != null) {
            // Connect first → second
            temp = first.next; // Save next of first
            first.next = second; // Link first to second
            first = temp; // Move first forward

            // Connect second → first
            temp = second.next; // Save next of second
            second.next = first; // Link second to first
            second = temp; // Move second forward
        }
    }

    // Utility function to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the reorderList function
    public static void main(String[] args) {
        // Create sample list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReorderList re = new ReorderList();

        System.out.println("Original List:");
        re.printList(head);

        // Call reorderList
        re.reorderList(head);

        System.out.println("Reordered List:");
        re.printList(head);
    }
}

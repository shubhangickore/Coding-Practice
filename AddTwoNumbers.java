import java.util.*;

// Helper class for linked list nodes
class ListNode {
    int val; // Stores the digit value of this node
    ListNode next; // Pointer to the next node in the list

    ListNode() {
    } // Default constructor

    ListNode(int val) { // Constructor for a node with just a value
        this.val = val;
    }

    ListNode(int val, ListNode next) { // Constructor with value + next node
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addtwono(ListNode l1, ListNode l2) {
        // Dummy node: placeholder to simplify building the result list
        ListNode dummy = new ListNode(0);

        // Current pointer: moves along the result list as we add new nodes
        ListNode current = dummy;

        // Carry: stores overflow when sum >= 10
        int carry = 0;

        // Loop until both lists are exhausted OR carry is non-zero
        while (l1 != null || l2 != null || carry != 0) {
            // Get digit from l1, or 0 if l1 is exhausted
            int x = (l1 != null) ? l1.val : 0;

            // Get digit from l2, or 0 if l2 is exhausted
            int y = (l2 != null) ? l2.val : 0;

            // Add digits + carry from previous step
            int sum = x + y + carry;

            // / operator → quotient (tens place) becomes new carry
            carry = sum / 10;

            // % operator → remainder (ones place) becomes the digit node
            current.next = new ListNode(sum % 10);

            // Move current forward so next digit attaches after this one
            current = current.next;

            // Advance l1 and l2 to their next nodes (if available)
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        // If carry remains after loop (like 99 + 1 = 100), add final node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the actual result list (skip dummy head)
        return dummy.next;
    }

    // Helper to print linked list for testing
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: l1 = [2,4,3] (represents 342)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Example: l2 = [5,6,4] (represents 465)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addtwono(l1, l2);

        // Output should be [7,0,8] (represents 807)
        printList(result);
    }
}

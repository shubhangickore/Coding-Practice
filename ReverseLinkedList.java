class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        // prev will eventually become the new head
        ListNode prev = null;

        // current starts at the original head
        ListNode current = head;

        // Traverse until the end of the list
        while (current != null) {
            // Save next node before breaking the link
            ListNode nextNode = current.next;

            // Reverse the pointer: current now points to prev
            current.next = prev;

            // Move prev forward (to current)
            prev = current;

            // Move current forward (to nextNode)
            current = nextNode;
        }

        // At the end, prev is the new head
        return prev;
    }

    // Helper to print list
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
        // Example: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversed = solution.reverseList(head);

        System.out.println("Reversed list:");
        printList(reversed);
    }
}

/*
 * 
 * Variable Meaning Example after 1st iteration
 * temp temporarily holds next node 2
 * curr.next = prev reverses pointer 1 → null
 * prev grows reversed part 1 → null
 * curr moves forward 2 → 3 → null
 * 
 */

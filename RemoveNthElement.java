import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthElement {
    public ListNode removeNthfromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        // Creates a "dummy" node with value 0.
        // It’s not part of the actual list; it’s a helper node placed before the head.
        // This avoids edge-case issues (like removing the first node).
        dummy.next = head;

        ListNode front = dummy;
        ListNode back = dummy;

        for (int i = 0; i <= n; i++) {
            front = front.next;
        }

        while (front != null) {
            front = front.next;
            back = back.next;
        }

        back.next = back.next.next;
        return dummy.next;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        RemoveNthElement re = new RemoveNthElement();
        int n = 2;

        ListNode newhead = re.removeNthfromEnd(head, n);

        System.out.println("Updated List: ");
        while (newhead != null) {
            System.out.print(newhead.val + " ");
            newhead = newhead.next;

        }
    }

}
// We use a dummy node to simplify edge cases. Then we move the front pointer
// n+1 steps ahead so that when it reaches the end,
// the back pointer is exactly before the node we want to remove. Finally, we
// skip that node by adjusting back.next.
// Returning dummy.next gives us the updated list without the nth node."

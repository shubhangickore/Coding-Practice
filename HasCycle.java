import java.util.*;

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Standard Floyd’s cycle detection
        while (fast != null && fast.next != null) {
            slow = slow.next; // move 1 step
            fast = fast.next.next; // move 2 steps

            if (slow == fast) { // pointers meet → cycle
                return true;
            }
        }

        return false; // reached end → no cycle
    }

    public static void main(String[] args) {
        // Create nodes
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        // Link them: 3 -> 2 -> 0 -> -4
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Create a cycle: -4 -> 2
        n4.next = n2;

        HasCycle cycle = new HasCycle();

        // Test with cycle
        System.out.println("Has cycle? " + cycle.hasCycle(n1)); // true

        // Break the cycle: -4 -> null
        n4.next = null;

        // Test without cycle
        System.out.println("Has cycle? " + cycle.hasCycle(n1)); // false
    }
}

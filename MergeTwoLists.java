import java.util.*;

class ListNode {
    int val;
    ListNode next;

    // Constructor with only value
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Constructor with value + next node
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoLists {
    public ListNode mergetwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(1);
        ListNode merge = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                merge.next = list1;
                list1 = list1.next;
            } else {
                merge.next = list2;
                list2 = list2.next;
            }
            merge = merge.next;
        }

        if (list1 == null) {
            merge.next = list2;
        } else {
            merge.next = list1;
        }

        return dummy.next;
    }

    public static void main(String args[]) {
        // Create list1 = [1 → 3 → 5]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        // Create list2 = [2 → 4 → 6]
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge lists
        MergeTwoLists mg = new MergeTwoLists();
        ListNode merged = mg.mergetwoLists(list1, list2);

        // Print merged list
        System.out.println("Merged List:");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}

// ListNode dummy = new ListNode(1);
// Create a "dummy" node with value 1.
// This node is just a placeholder to simplify the merging logic.
// It is NOT part of the final merged list — we will skip it later by returning
// dummy.next.

// ListNode merge = dummy;
// Create a pointer called 'merge' that starts at the dummy node.
// Think of 'merge' as a moving pen: it will walk through the list,
// attaching nodes one by one as we build the merged list.

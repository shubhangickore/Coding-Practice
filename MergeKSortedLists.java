import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-heap to store nodes based on their values
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the head of each list to the heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }

        // Dummy node to simplify result list construction
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Extract the smallest node and add its next to the heap
        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();
            current.next = smallest;
            current = current.next;

            if (smallest.next != null) {
                minHeap.add(smallest.next);
            }
        }

        return dummy.next; // Skip dummy and return merged list
    }

    // Example usage
    public static void main(String[] args) {
        // List1: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // List2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // List3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = { l1, l2, l3 };

        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode merged = merger.mergeKLists(lists);

        // Print merged list
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        // Output: 1 1 2 3 4 4 5 6 //
    }
}

import java.util.*;

class RecentCounter {
    private Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);
        while (q.peek() < t - 3000) {
            q.poll(); // Using poll() avoids exceptions — it just returns null if empty.remove() would
                      // crash if the queue is empty.

        }
        return q.size();

    }

    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();

        // Test calls
        System.out.println(rc.ping(1)); // Output: 1
        System.out.println(rc.ping(100)); // Output: 2
        System.out.println(rc.ping(3001)); // Output: 3
        System.out.println(rc.ping(3002)); // Output: 3
        System.out.println(rc.ping(6000)); // Output: 1
    }

}

/*
 * Dry Run of This Main Method
 * ping(1) → queue = [1] → returns 1
 * 
 * ping(100) → queue = [1,100] → returns 2
 * 
 * ping(3001) → queue = [1,100,3001] → returns 3
 * 
 * ping(3002) → queue = [100,3001,3002] → returns 3 (1 removed)
 * 
 * ping(6000) → queue = [6000] → returns 1 (100,3001,3002 removed as too old)
 */
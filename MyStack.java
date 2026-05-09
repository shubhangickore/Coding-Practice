import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    // Constructor
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Pop element from stack (removes permanently)
    public int pop() {
        // Move all but last element from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        // Last element in q1 is the stack top
        int top = q1.remove(); // remove permanently
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    // Top element of stack (restores after peek)
    public int top() {
        // Move all but last element from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }
        // Peek at last element
        int top = q1.peek();
        // Move it into q2 to restore
        q2.add(q1.remove());
        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // 3 (restored back)
        System.out.println("Pop element: " + stack.pop()); // 3 (removed permanently)
        System.out.println("Top element: " + stack.top()); // 2
        System.out.println("Pop element: " + stack.pop()); // 2
        System.out.println("Top element: " + stack.top()); // 1
        System.out.println("Is stack empty? " + stack.empty()); // false
        System.out.println("Pop element: " + stack.pop()); // 1
        System.out.println("Is stack empty? " + stack.empty()); // true
    }
}

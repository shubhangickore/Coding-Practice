import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push element onto stack
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    // Pop element from stack
    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    // Return top element
    public int top() {
        return stack.peek();
    }

    // Return minimum element
    public int getMin() {
        return minStack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // Test operations
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top element: " + minStack.top()); // 2
        System.out.println("Current Min: " + minStack.getMin()); // 2

        minStack.pop(); // removes 2
        System.out.println("Top element after pop: " + minStack.top()); // 7
        System.out.println("Current Min after pop: " + minStack.getMin()); // 3
    }
}

/*
 * Here, you declare the fields (stack and minStack) at the class level but
 * don’t initialize them immediately.
 * 
 * They are initialized inside the constructor, which runs whenever you create a
 * new MinStack object.
 * 
 * This approach is common when:
 * 
 * You want to delay initialization until object creation.
 * 
 * You might later change the constructor to accept parameters (e.g., initial
 * capacity, custom behavior).
 * 
 * It keeps the class flexible.
 */
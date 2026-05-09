class CircularQueue {
    private int[] arr; // array to store elements
    private int front; // points to front element
    private int rear; // points to last element
    private int size; // capacity of queue
    private int count; // current number of elements

    // Constructor
    public CircularQueue(int k) {
        arr = new int[k];
        size = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Enqueue: add element at rear
    public boolean enqueue(int x) {
        if (isFull())
            return false; // cannot insert if full
        rear = (rear + 1) % size; // move rear circularly
        arr[rear] = x;
        count++;
        return true;
    }

    // Dequeue: remove element from front
    public boolean dequeue() {
        if (isEmpty())
            return false; // cannot remove if empty
        front = (front + 1) % size; // move front circularly
        count--;
        return true;
    }

    // Get front element
    public int getFront() {
        if (isEmpty())
            return -1;
        return arr[front];
    }

    // Get rear element
    public int getRear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }

    // Check if empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Check if full
    public boolean isFull() {
        return count == size;
    }

    // Display queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < count; i++) {
            int index = (front + i) % size;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.display(); // 10 20 30 40 50

        System.out.println("Front: " + cq.getFront()); // 10
        System.out.println("Rear: " + cq.getRear()); // 50

        cq.dequeue(); // removes 10
        cq.dequeue(); // removes 20

        cq.display(); // 30 40 50

        cq.enqueue(60);
        cq.enqueue(70);

        cq.display(); // 30 40 50 60 70
        System.out.println("Front: " + cq.getFront()); // 30
        System.out.println("Rear: " + cq.getRear()); // 70
    }
}

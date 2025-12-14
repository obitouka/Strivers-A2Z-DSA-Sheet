package z_college.Queue;

class Queue {
    private final int size;
    private int front;
    private int rear;
    private final int[] arr;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        arr[++rear] = data;
        System.out.println(data + " enqueued");
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[front];
        
        if (front == rear) {
            front = rear = -1;
        } else {
            front++;
        }
        return val;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (rear == size - 1);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

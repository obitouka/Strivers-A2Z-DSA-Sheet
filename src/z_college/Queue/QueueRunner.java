package z_college.Queue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());

        q.display();
    }
}

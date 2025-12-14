package z_college.Stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        System.out.println("Popped: " + s.pop());
        System.out.println("Top element: " + s.peek());

        s.display();
    }
}

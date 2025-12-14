package z_college;

class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int value) {
            data = value;
            prev = null;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {       // empty list
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void insertAtPosition(int value, int pos) {

        if (pos == 1) {
            insertAtBeginning(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        if (temp == tail) {
            insertAtEnd(value);
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    void deleteAtBeginning() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    void deleteAtEnd() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    void deleteAtPosition(int pos) {

        if (head == null) return;

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Position out of range");
            return;
        }

        if (temp == tail) {
            deleteAtEnd();
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    void deleteByValue(int value) {

        if (head == null) return;

        if (head.data == value) {
            deleteAtBeginning();
            return;
        }

        if (tail.data == value) {
            deleteAtEnd();
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value)
            temp = temp.next;

        if (temp == null) return;

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

     boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    int count() {
        int c = 0;
        Node temp = head;

        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    void displayForward() {
        Node temp = head;

        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void displayBackward() {
        Node temp = tail;

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertAtBeginning(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtPosition(25, 3);

        dll.displayForward();
        dll.displayBackward();

        dll.deleteAtBeginning();
        dll.displayForward();

        dll.deleteAtEnd();
        dll.displayForward();

        dll.deleteAtPosition(2);
        dll.displayForward();

        dll.deleteByValue(25);
        dll.displayForward();

        System.out.println("found 30 ? " + dll.search(30));
        System.out.println("total nodes: " + dll.count());
    }
}

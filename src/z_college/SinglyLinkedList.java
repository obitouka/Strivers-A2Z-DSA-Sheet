package z_college;

class SinglyLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    Node head = null;

    void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
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

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteAtBeginning() {
        if (head == null) return;

        head = head.next;
    }

   void deleteAtEnd() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    void deleteAtPosition(int pos) {

        if (head == null) return;

        if (pos == 1) {
            deleteAtBeginning();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range");
            return;
        }

        temp.next = temp.next.next;
    }

    void deleteByValue(int value) {
        if (head == null) return;

       if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != value)
            temp = temp.next;

        if (temp.next == null) return;

        temp.next = temp.next.next;
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

    void display() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtPosition(25, 3);

        list.display();

        list.deleteAtBeginning();
        list.display();

        list.deleteAtEnd();
        list.display();

        list.deleteAtPosition(2);
        list.display();

        list.deleteByValue(25);
        list.display();

        System.out.println("found 20? " + list.search(20));
        System.out.println("total nodes: " + list.count());
    }
}

package doublylinkedlist;

public class DoublyLinkedList {

    Node head;
    Node tail;

    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtFirstPos(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if(head == null) {
            tail = newNode;
        } else {
            head.prev = newNode;
        }

        head = newNode;
    }

    public void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);

        if(pos == 0) {
            insertAtFirstPos(data);
            return;
        }

        Node temp = head;
        for(int i=0; i< pos -1; i++) {
            if(temp == null) {
                System.out.println("Invalid position observed!!");
                return;
            }
            temp = temp.next;
        }

        // If they try to insert at end of the linked list
        if(temp.next == null) {
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;
        } else {
            newNode.next = temp.next;
            temp.next.prev = newNode;
            newNode.prev = temp;
            temp.next = newNode;
        }


    }

    public void iterate() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public void reverse() {

        Node temp = tail;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }

    }
}
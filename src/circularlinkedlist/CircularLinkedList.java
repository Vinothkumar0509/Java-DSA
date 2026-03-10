package circularlinkedlist;

import java.util.Objects;

public class CircularLinkedList {
    Node last;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public CircularLinkedList() {
        last = null;
    }

    ;public void addAtFirst(int data) {
        Node newNode = new Node(data);

        if(Objects.isNull(last)) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void traverse() {
        if(last == null) {
            return;
        }
        Node temp = last.next;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }  while(temp != last.next);

    }

    public void addAtLast(int data) {
        Node newNode = new Node(data);

        if(Objects.isNull(last)) {
            newNode.next = newNode;
            last = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    void clear() {
        last = null;
    }

    public int removeAtFirsPos() {
        if(last == null) {
            System.out.println("List is Empty");
        }

        int temp = last.next.data;

        if(last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }

        return temp;
    }
}

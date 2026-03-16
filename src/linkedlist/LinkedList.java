package linkedlist;

import java.util.Iterator;



public class LinkedList<T> implements Iterable<T> {

    private Node head;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.data;
                temp = temp.nextAddress;
                return val;
            }
        };
    }

    class Node {
        T data;
        Node nextAddress;

        public Node(T data) {
            this.data = data;
            this.nextAddress = null;
        }
    }

    public LinkedList() {
        head = null;
    }


    public void addFirst(T data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }

        else {
            newNode.nextAddress = head;
            head = newNode;

        }

    }

    public void addAtPos(int pos, T data) {
        Node newNode = new Node(data);
        Node temp = head;

        if(pos == 0) {
            addFirst(data);
            return;
        }

        for(int i=0; i< pos-1; i++) {
            if(temp == null) {
                throw new IllegalArgumentException("Cannot add number, because Linked list is empty!");
            }
            temp = temp.nextAddress;
        }

        // Link logic
        newNode.nextAddress = temp.nextAddress;
        temp.nextAddress = newNode;
    }

    public void removeValue(T data) {
        Node temp = head;
        Node prev;

        if(head == null) {
            throw new IllegalArgumentException("Cannot remove number, because Linked list is empty!");
        }

        while(temp != null) {
            prev = temp;
            temp = temp.nextAddress;

            if(temp.data == data) {
                prev.nextAddress = temp.nextAddress;
                return;

            }
        }
    }



    public void iterate() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.nextAddress;
        }

    }


    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next;

        while(current != null) {
            next = current.nextAddress;
            current.nextAddress = prev;
            prev = current;
            current = next;
        }

        head = prev;

    }


}
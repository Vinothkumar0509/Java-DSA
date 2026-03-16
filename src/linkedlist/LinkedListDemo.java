package linkedlist;


import java.util.Iterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();

        list.addFirst(7);
        list.addFirst(10);
        list.addFirst(15);
        list.addFirst(20);

        System.out.println("Before Insert at position");
        list.iterate();
        System.out.println();

        System.out.println("After Insertion at position");
        list.addAtPos(2, 5);
        list.addAtPos(0, 3);
        list.iterate();
        System.out.println();

        System.out.println("After Deletion!");
        list.removeValue(5);
        list.iterate();
        System.out.println();


        list.addAtPos(2, "Arun");

        Iterator<Object> it = list.iterator();

        while(it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
        System.out.println();


        list.reverse();
        System.out.println("After reverse");
        list.iterate();
        System.out.println();


    }
}
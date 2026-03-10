package circularlinkedlist;

public class CircularLinkedListDemo {

    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.addAtFirst(5);
        circularLinkedList.addAtFirst(10);
        circularLinkedList.addAtFirst(20);
        circularLinkedList.addAtFirst(200);
        circularLinkedList.addAtFirst(50);
        circularLinkedList.addAtFirst(15);

        circularLinkedList.traverse();

        System.out.println();

        circularLinkedList.clear();

        System.out.println("Add at last");

        circularLinkedList.addAtLast(5);
        circularLinkedList.addAtLast(15);
        circularLinkedList.addAtLast(25);
        circularLinkedList.addAtLast(35);
        circularLinkedList.addAtLast(45);

        circularLinkedList.traverse();

        int i = circularLinkedList.removeAtFirsPos();
        System.out.println();
        System.out.println("After deletion!! "+ i );
        circularLinkedList.traverse();

    }
}
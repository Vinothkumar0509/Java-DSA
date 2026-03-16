package doublylinkedlist;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAtFirstPos(1);
        doublyLinkedList.insertAtFirstPos(5);
        doublyLinkedList.insertAtFirstPos(9);

        doublyLinkedList.iterate();
        System.out.println();

        doublyLinkedList.insertAtPosition(100, 2);
        System.out.println("After Insertion");
        doublyLinkedList.iterate();
        System.out.println();


        System.out.println("After reverse");
        doublyLinkedList.reverse();
    }
}

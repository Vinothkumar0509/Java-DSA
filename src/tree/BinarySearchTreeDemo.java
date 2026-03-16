package tree;

public class BinarySearchTreeDemo {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(3);
//        bst.insert(10);
//        bst.insert(10);
//        bst.insert(3);
//        bst.insert(6);
//        bst.insert(12);
//        bst.insert(8);

        bst.insert(2);
        bst.insert(1);
        bst.insert(6);
        bst.insert(5);
        bst.insert(4);
        bst.insert(9);
        bst.insert(8);
        bst.insert(7);

        bst.inOrder();

        System.out.println();

//        System.out.println(bst.search(4) ? "Found" : "Not Found");

        bst.deleteNode(bst.root, 6);
        bst.inOrder();

    }
}
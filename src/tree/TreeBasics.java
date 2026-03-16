package tree;

public class TreeBasics {

    public static void main(String[] args) {
        Tree tree = new Tree(5);

        tree.insertAtLeftPos(tree.root, 10);
        tree.insertAtRightPos(tree.root, 6);
        tree.insertAtLeftPos(tree.root.left, 9);
        tree.insertAtRightPos(tree.root.left, 3);
        tree.insertAtLeftPos(tree.root.right, 2);
        tree.insertAtRightPos(tree.root.right, 7);

        tree.preOrderTraversal(tree.root);


    }
}
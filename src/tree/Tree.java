package tree;

public class Tree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Tree(int data) {
        root = new Node(data);
    }

    public void preOrderTraversal(Node root) {
        if(root != null) {
            System.out.print(root.data+ " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

    }

    public void insertAtLeftPos(Node node, int data) {
        Node newNode = new Node(data);
        node.left = newNode;
    }

    public void insertAtRightPos(Node node, int data) {
        Node newNode = new Node(data);
        node.right = newNode;
    }
}
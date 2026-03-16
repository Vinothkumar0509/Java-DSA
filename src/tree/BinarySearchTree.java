package tree;

public class BinarySearchTree {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }


    public void insert(int data) {
        root = insertData(root, data);
    }

    private Node insertData(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }

        if(root.data > data) {
            root.left = insertData(root.left, data);
        }
        else {
            root.right = insertData(root.right, data);
        }

        return root;
    }

    public void inOrder() {
        inOrderTraversal(root);
    }


    public void inOrderTraversal(Node root) {
        if(root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data+ " ");
            inOrderTraversal(root.right);
        }
    }


    /**
     * Binary Search Tree - Search Operation
     * @param input
     * @return
     */
    public boolean search(int input) {

        while(root != null) {
            if(root.data == input) {
                return true;
            }
            if(root.data > input) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        }

        return false;

    }


    /**
     * Delete Node
     */
    public Node deleteNode(Node root, int data) {
        if(root == null) {
            return root;
        }
        if(data < root.data) {
            root.left = deleteNode(root.left, data);
        }
        else if(data > root.data) {
            root.right = deleteNode(root.right, data);
        }

        else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            root.data = getMinDataFromRight(root.right);
            root.right = deleteNode(root.right, root.data);
        }

        return root;
    }

    private int getMinDataFromRight(Node root) {
        int minValue = root.data;
        while(root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }

        return minValue;
    }

}
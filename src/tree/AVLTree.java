package tree;

public class AVLTree {

    Node root;

    class Node {
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 0;
        }
    }

    private int height(Node node) {
        return node == null?-1:node.height;
    }

    private int calculateBalancedFactor(Node node) {
        if(node == null) return 0;
        return height(node.left) - height(node.right) ;
    }

    public void insert(int data) {
        root = insertData(root,data);
    }

    private Node rightRotate(Node y)
    {
        Node x = y.left;
        Node n1 = x.right;
        x.right = y;
        y.left = n1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    private Node leftRotate(Node x)
    {
        Node y = x.right;
        Node n1 = y.left;
        y.left = x;
        x.right = n1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    private Node insertData(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data> data) {
            root.left = insertData(root.left,data);
        } else if (root.data< data) {
            root.right = insertData(root.right,data);
        }
        else {
           return root;
        }

        root.height = Math.max(height(root.left), height(root.right)) + 1;

        int balanceFactor = calculateBalancedFactor(root);

        //LL
        if (balanceFactor > 1 && data<root.left.data)  {
            return rightRotate(root);
        }
        //RR
        if (balanceFactor < -1 && data>root.right.data)  {
            return leftRotate(root);
        }

        //LR
        if (balanceFactor > 1 && data>root.left.data)//changes here
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        //RL
        if(balanceFactor < -1 && data<root.right.data)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }

    public void inOrderTraversal(Node root) {
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.data+" ");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        int[] keys={10,20,30,40,50,25};

        for(int key:keys){
            tree.insert(key);
        }
        System.out.println("Inorder traversal(balanced AVL Tree):");
        tree.inOrder();
    }

    private void inOrder() {
        inOrderTraversal(root);
    }
}

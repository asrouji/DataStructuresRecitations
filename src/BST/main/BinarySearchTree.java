package BST.main;

public class BinarySearchTree implements BinaryTree {

    private Node root;
    private int size;

    /**
     * Constructs a new empty BinarySearchTree.
     */
    public BinarySearchTree() {
        this.root = null;
    }

    /**
     * Adds a new value to the BinarySearchTree.
     * 
     * @param val the value to add
     */
    public void add(int val) {
        this.size++;
        if (this.root == null) {
            this.root = new Node(val);
            return;
        }
        Node current = this.root;
        while (current != null) {
            if (val < current.data) {
                // go left
                if (current.left == null) {
                    current.left = new Node(val);
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = new Node(val);
                    return;
                }
                current = current.right;
            }
        }
    }

    /**
     * Checks if the BinarySearchTree contains a value.
     * 
     * @param val the value to check
     */
    public boolean contains(int val) {
        return containsNode(val, this.root);
    }

    private boolean containsNode(int val, Node n) {
        // Base Case
        if (n == null) { return false; }
        if (n.data == val) { return true; }
        // Recursive Case
        if (val < n.data) { return containsNode(val, n.left); }
        return containsNode(val, n.right);
    }

    /**
     * Returns the size of the BinarySearchTree.
     * 
     * @return the size of the BinarySearchTree
     */
    public int size() {
        return this.size;
    }

    public void traverseTree(String method) {
        if (method.equals("preorder")) { this.preOrder(this.root); }
        if (method.equals("inorder")) { this.inOrder(this.root); }
        if (method.equals("postorder")) { this.postOrder(this.root); }
    }

    private void preOrder(Node n) {
        if (n == null) { return; }
        // Visit Behavior
        System.out.print(n.data);
        // Recurse Left
        preOrder(n.left);
        // Recurse Right
        preOrder(n.right);
    }

    private void inOrder(Node n) {
        if (n == null) { return; }
        inOrder(n.left);
        System.out.print(n.data);
        inOrder(n.right);
    }

    private void postOrder(Node n) {
        if (n == null) { return; }
        postOrder(n.left);
        postOrder(n.right);
        System.out.println(n.data);
    }

    /**
     * Node class for the BinarySearchTree.
     */
    private class Node {
        private int data;
        private Node left;
        private Node right;

        /**
         * Constructs a new Node with the given data.
         * 
         * @param data value to add to the Node
         */
        public Node(int data) {
            this.data = data;
        }
    }

}

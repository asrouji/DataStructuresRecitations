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
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if the BinarySearchTree contains a value.
     * 
     * @param val the value to check
     */
    public boolean contains(int val) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the size of the BinarySearchTree.
     * 
     * @return the size of the BinarySearchTree
     */
    public int size() {
        throw new UnsupportedOperationException();
    }

    public void traverseTree(String method) {
        if (method.equals("preorder")) { this.preOrder(this.root); }
        if (method.equals("inorder")) { this.inOrder(this.root); }
        if (method.equals("postorder")) { this.postOrder(this.root); }
    }

    private void preOrder(Node n) {
        throw new UnsupportedOperationException();
    }

    private void inOrder(Node n) {
        throw new UnsupportedOperationException();
    }

    private void postOrder(Node n) {
        throw new UnsupportedOperationException();
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

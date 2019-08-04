class Node {
    public Node next;
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraverse {
    Node root;

    //Constructor
    TreeTraverse() {
        root = null;
    }

    public static void main(String[] args) {
        TreeTraverse bst = new TreeTraverse();
        bst.root = new Node(1);
        bst.root.left = new Node(2);
        bst.root.right = new Node(3);
        bst.root.left.left = new Node(4);
        bst.root.left.right = new Node(5);

        System.out.println("Preorder traversal: ");
        bst.printPreorder();

        System.out.println("\nInorder traversal:");
        bst.printInorder();

        System.out.println("\nPostorder traversal:");
        bst.printPostorder();
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);

        printPostorder(node.right);

        System.out.print(node.data + " ");
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);

        System.out.print(node.data + " ");

        printInorder(node.right);
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    void printPostorder() {
        printPostorder(root);
    }

    void printInorder() {
        printInorder(root);
    }

    void printPreorder() {
        printPreorder(root);
    }
}


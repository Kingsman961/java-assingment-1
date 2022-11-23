
// 1) Java program to convert a given binary tree to a doubly linked list
public class BinaryTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    Node head;

    static Node prev = null;

    void BinaryTreeToDoubleLinkedList(Node root) {

        if (root == null)
            return;

        BinaryTreeToDoubleLinkedList(root.left);

        if (prev == null)
            head = root;
        else {
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        BinaryTreeToDoubleLinkedList(root.right);
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        // Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        // Converts the given binary tree to doubly linked list
        bt.BinaryTreeToDoubleLinkedList(bt.root);

        // Displays the nodes present in the list
        bt.printList(bt.head);
    }
}

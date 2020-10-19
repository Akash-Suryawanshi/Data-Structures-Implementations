package MyCode;

public class Trees {
    static class Node {
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left=right=null;
        }
    }
    static class BinaryTree {
        Node root;
        public BinaryTree() {
            root = null;
        }
    }

    public static void preorder(Node n) {
        if (n==null) return;
        else {
            System.out.print(n.data + " ");
            preorder(n.left);
            preorder(n.right);
        }

    }
    public static void postorder(Node n) {
        if (n==null) {
            return;
        }
        else {
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.data + " ");
        }
    }

    public static void inorder(Node n) {
        if (n == null) return;
        else {
            inorder(n.left);
            System.out.print(n.data + " ");
            inorder(n.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        b.root = new Node(0);
        b.root.left = new Node(1);
        b.root.right = new Node(2);
        b.root.left.left = new Node(3);
        b.root.left.right = new Node(4);
        b.root.right.left = new Node(5);
        b.root.right.right = new Node(6);
        preorder(b.root);
        System.out.println();
        postorder(b.root);
        System.out.println();
        inorder(b.root);
    }
}

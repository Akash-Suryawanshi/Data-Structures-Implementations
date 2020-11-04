package MyCode;


public class RBTree {
    static class Node {
        int data;
        Node left, right, parent;
        boolean red;

        public Node(int data) {
            this.left = this.right = this.parent = null;
            red = true;
            this.data = data;
        }
    }

    static class RedBlackTree extends RBTree {
        Node root;

        public RedBlackTree() {
            root = null;
        }
    }

    public void insert(int data) {

    }

    public Node insert(Node root, int data) {
        if (root == null) {
            Node node = new Node(data);
            node.red = true;
            return node;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public static void main(String[] args) {
        RedBlackTree rb = new RedBlackTree();
        rb.insert(rb.root, 4);
        System.out.println(rb.root.data);
    }
}

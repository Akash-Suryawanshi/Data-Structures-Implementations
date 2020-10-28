package MyCode;


public class AVL_Tree extends SearchTree {
    public void add_avl(int data) {
        root = addavl(root, data);
    }
    public static boolean check_balance(Node root) {
        if (root.left==null || root.right==null) {
            if (root.height > 2) return false;
        }
        else if (Math.abs(root.right.height - root.left.height) > 1) {
            return false;
        }
        check_balance(root.right);
        check_balance(root.left);
        return true;
    }
    public Node addavl(Node root, int data) {
        if (root==null) {
            Node n = new Node(data);
            return n;
        }
        insert(data);
    }
    public static void main(String[] args) {
        AVL_Tree a = new AVL_Tree();
        a.insert(5);
        a.insert(2);
        a.insert(7);
        a.insert(8);
        a.insert(1);
        a.insert(9);
        a.insert(10);
        a.insert(6);
        inorder(a.root);
        check_balance(a.root);

    }
    }


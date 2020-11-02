package MyCode;

public class AVL_Tree extends SearchTree {
    public void add_avl(int data) {
        root = addavl(root, data);
    }

    public Node addavl(Node root, int data) {
        if (root == null) {
            Node cur = new Node(data);
            return cur;
        } else if (data < root.data) {
            root.left = addavl(root.left, data);
            root.left.parent = root;
            if (root.right == null) {
                root.height = root.left.height + 1;
            } else {
                root.height = Math.max(root.right.height, root.left.height) + 1;
            }

        } else {
            root.right = addavl(root.right, data);
            root.right.parent = root;
            if (root.left == null) {
                root.height = root.right.height + 1;
            } else {
                root.height = Math.max(root.right.height, root.left.height) + 1;
            }
        }
        return root;
    }
    public boolean check_balance() {
        boolean val = check_balance(root);
        return val;
    }
    public boolean check_balance(Node root) {
        if (root.left == null || root.right == null) {
            if (root.height > 2) return false;
        } else if (Math.abs(root.right.height - root.left.height) > 1) {
            return false;
        } else {
            check_balance(root.right);
            check_balance(root.left);
        }
        return true;
    }
    public void iter_addavl(int data) {
        root = iter_addavl(root, data);
    }
    public Node iter_addavl(Node root, int data) {
        Node cur = root;
        while (cur!=null) {
            if (cur.data < data) {
                cur = cur.left;
            }
            else if (cur.data > data){
                cur = cur.right;
            }
            else {

            }
        }
        if (!check_balance(root)) {

        }
        return root;
    }

    public static void main(String[] args) {
        AVL_Tree a = new AVL_Tree();
        a.add_avl(1);
        a.add_avl(0);
        a.add_avl(2);
        System.out.println("root height = " + a.root.height);
        System.out.println(a.check_balance());
        System.out.println(a.root.right.height);
        System.out.println(a.root.left.height);
        System.out.println(a.root.height);

        /*check_balance(a.root);*/

    }
}


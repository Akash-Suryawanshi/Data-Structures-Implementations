package MyCode;
import java.util.Stack;


public class Trees {
    static class Node {
        int data;
        Node left, right, parent;
        public Node(int item) {
            data = item;
            left=right=parent=null;
        }
    }
    static class BinaryTree extends Trees{
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
    
    public static boolean isoperator(char operator) {
        if (operator=='+' || operator=='-' || operator=='/' || operator=='*'){
            return true;
        }
        return false;
    }
     public static void iter_pre(Node root) {
        if (root==null) return;
         Stack<Node> stack = new Stack<Node>();
         stack.push(root);
         while (!stack.isEmpty()) {
             Node n = stack.peek();
             System.out.print(n.data+" ");
             stack.pop();
             if (n.right!=null) {
                 stack.push(n.right);
             }
             if (n.left!=null) {
                 stack.push(n.left);
             }
         }
     }
     public static void iter_in(Node root) {
        Stack<Node> s = new Stack<>();
        Node cur = root;
        while (cur!=null || !s.isEmpty()) {
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            System.out.print(cur.data + " ");
            cur = cur.right;
        }
     }
     public static void iter_post(Node root) {
        Stack<Node> s = new Stack<Node>();

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
        System.out.println();
        /*iter_pre(b.root);*/
        iter_in(b.root);

    }
}

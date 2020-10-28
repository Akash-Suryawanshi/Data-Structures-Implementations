package MyCode;

public class SearchTree extends Trees.BinaryTree {
        public void insert(int data) {
            root = insert_data(root, data);
        }
        public Node insert_data(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }
            if (data < root.data) {
                root.left = insert_data(root.left, data);
            } else {
                root.right = insert_data(root.right, data);
            }
            return root;
        }

        public Node recur_search(Node root, int data) {
            if (root==null || root.data == data) {
                return root;
            }
            if (data<root.data) {
                return recur_search(root.left, data);
            }
            return recur_search(root.right, data);
        }
        public Node iter_search(Node root, int data) {
            Node cur = root;
            while (cur!=null) {
                if (data<cur.data) {
                    cur = cur.left;
                }
                else if (data> cur.data) {
                    cur = cur.right;
                }
                else return cur;
            }
            return null;
        }

        /*public static Node recur_successor() {

        }*/

        /*public static boolean checkbst(Node root) {
            if (root==null) {

            }
        }*/


    public static void main(String[] args) {
        SearchTree b = new SearchTree();
        b.insert(8);
        b.insert(7);
        b.insert(3);
        b.insert(23);
        b.insert(34);
        b.insert(22);
        b.insert(19);
        b.insert(-3);
        inorder(b.root);
        System.out.println();
        Node n = b.iter_search(b.root, 23);
        System.out.println(n!=null);



    }
}

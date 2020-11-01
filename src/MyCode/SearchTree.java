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
                root.left.parent = root;
            } else {
                root.right = insert_data(root.right, data);
                root.right.parent = root;
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
        public Node iter_search(int data) {
            Node n = iter_search(root, data);
            return n;
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
        public int successor(int data) {
            Node ans = successor(root, data);
            return ans.data;
        }
        public Node successor(Node root, int data) {
            Node n = iter_search(root, data);
            if (n.right==null) {
                while (n.parent!=null && n.parent.right==n) {
                    n = n.parent;
                }
                if (n==root) {
                    System.out.println("No successor");
                    return null;
                }
                else {
                    return n.parent;
                }
            }
            else {
                n = n.right;
                while (n.left!=null) {
                    n = n.left;
                }
                return n;
            }

        }
        public int predecessor(int data) {
            Node ans = predecessor(root, data);
            return ans.data;
        }
        public Node predecessor(Node root, int data) {
            Node n = iter_search(root, data);
            if (n.left==null) {
                while (n.parent!=null && n.parent.left==n) {
                    n = n.parent;
                }
                if (n==root) {
                    System.out.println("No predecessor");
                    return null;
                }
                else {
                    return n.parent;
                }
            }
            else {
                n = n.left;
                while (n.right!=null) {
                    n = n.right;
                }
                return n;
            }
        }

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
        b.insert(4);
        b.insert(34);
        b.insert(22);
        b.insert(19);
        b.insert(-3);
        inorder(b.root);
        System.out.println();
        /*int ans = b.successor(4);
        System.out.println(ans);*/
        System.out.println(b.predecessor(34));
        /*Node t = iter_search(b.root, 34);
        System.out.println(t.parent.parent.data);*/


    }
}

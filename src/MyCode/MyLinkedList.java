package MyCode;

public class MyLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        // create a new node //
        Node cur = new Node(data);
        if (head == null) {
            head = cur;
        }
        else {
            tail.next = cur;
        }
        tail = cur;
    }
    public void printlist() {
        Node cur = head;
        if (head == null) {
            System.out.print("Empty");
        }
        else {
            while (cur != null) {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }

        }
    }
    public static void main(String[] args) {
        MyLinkedList z = new MyLinkedList();
        z.addNode(3);
        z.addNode(5);
        z.addNode(7);
        z.addNode(9);
        z.addNode(15);
        z.addNode(22);

        z.printlist();
    }
}

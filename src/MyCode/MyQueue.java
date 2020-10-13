package MyCode;
import java.lang.Math;

public class MyQueue {
    private final int Capacity = 100;
    private int front;
    private int rear;
    private int size;
    private final int[] arr;

    public MyQueue() {
        arr = new int[Capacity];
        front = 0;
        rear = -1;
        size = 0;


    }
    public int size() {
        size = Math.abs(front-rear) + 1;
        return size;
    }
    public boolean IsEmpty() {
        return (size==0);
    }
    public void enqueue(int item) {
        if (size() == Capacity) {
            System.out.print("Queue is full");
        }
        else {
            rear = (rear+1)%Capacity;
            arr[rear] = item;
        }
    }
    public void dequeue() {
        if (size()==0) {
            System.out.print("Queue is already empty");
        }
        else {
            front = (front+1)%Capacity;
            size--;

        }
    }
    public int peek() {
        if (IsEmpty()) {
            System.out.print("Queue is empty");
            System.exit(1);
        }
        return arr[front];

    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(6);
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.peek());
    }

}

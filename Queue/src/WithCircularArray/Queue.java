package WithCircularArray;

public class Queue {
    public final int CAPACITY;
    public int[] array;
    public int front;
    public int rear;
    public int numberOfItems;


    public Queue(int capacity) {
        CAPACITY = capacity;
        array = new int[CAPACITY];
    }

    public boolean isEmpty() {
        if (numberOfItems < 1) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (numberOfItems == CAPACITY) {
            return true;
        }
        return false;
    }

    public void enqueue(int data) throws Exception {
        if (isFull()) {
            throw new Exception("Queue overflow");
        }
        array[rear] = data;
        rear++;
        numberOfItems++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue underflow");
        }
        int temp=array[front];
        front++;
        numberOfItems--;
        return temp;

    }
    public int front(){
        return array[front];
    }
}

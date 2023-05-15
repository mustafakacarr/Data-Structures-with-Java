package WithArray;

import java.util.ArrayList;

public class Stack {

    final int CAPACITY = 100; //(MAX NUMBER OF ITEM)
    public int[] stack;
    public int size;

    public Stack() {
        stack = new int[CAPACITY];
        size = 0;
    }

    public int push(int newData) {
        if (isFull()) {
            return -1;
        }
        stack[size] = newData;

        size++;
        return 0;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("WithArray.Stack underflow");
        }

        int top = stack[size - 1];
        size--;
        return top;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("WithArray.Stack underflow");
        }

        return stack[size - 1];
    }

    public boolean isFull() {
        if (size == CAPACITY - 1)
            return true;
        else
            return false;
    }

    public  boolean isEmpty() {
        if (size < 1)
            return true;
        else
            return false;
    }

}

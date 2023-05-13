package WithLinkedList;

public class Stack {
    public StackNode topNode;

    public Stack() {
        topNode = null;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.nextNode = topNode;
        topNode = node;
    }
    public int pop() throws Exception {
        System.out.println();
        if (isEmpty())
            throw new Exception("Stack underflow");
       StackNode temp=topNode;
        topNode=topNode.nextNode;

        return temp.data;
    }
    public boolean isEmpty() {
        if (topNode == null)
            return true;
        else
            return false;
    }

    public int top() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");
        }
        return topNode.data;
    }


}

package WithLinkedList;

public class QueueLinkedList {
    public Node frontNode, rearNode;

    public QueueLinkedList() {
        frontNode = null;
        rearNode = null;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (frontNode == null) {
            frontNode = node;
            rearNode = node;
        } else {
            rearNode.nextNode = node;
            rearNode = node;
        }
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int temp = frontNode.data;
        frontNode = frontNode.nextNode;
        return temp;
    }

    public boolean isEmpty() {
        if(frontNode==null){
            return true;
        }else return false;
    }

}

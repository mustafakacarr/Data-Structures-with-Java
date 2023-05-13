package MultiplyLinkedList;

public class MLinkedListImp {
    public Node head, tail;

    public MLinkedListImp() {
        head = null;
        tail = null;
    }

    public void addToHead(String data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            head = node;
            tail = node;
        }else {
            node.nextNode = head;
            head.previousNode = node;
            head = node;
        }

    }

    public void addToTail(String data) {
        Node node = new Node();
        node.data = data;
        node.nextNode = null;
        if (head != null) {
            tail.nextNode = node;
            node.previousNode = tail;
            tail = node;
        } else {
            head = node;
            tail = node;
        }
    }

    public void listNodes() {
        Node currentNode = head;
        if (head == null) {
            System.out.println("There is no any node");
        }
        System.out.print("Current node data: [");
        while (currentNode != null) {
            System.out.print(currentNode.data + ", ");
            currentNode = currentNode.nextNode;
        }
        System.out.println("]");
    }

    public void searchInList(String data) {
        Node currentNode = head;
        if (head == null) {
            System.out.println("There is no any node");
        }
        Node foundNode = null;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                foundNode = currentNode;
            }

            currentNode = currentNode.nextNode;
        }
        System.out.println("The found value of data: " + foundNode.data + ". value of next one: " + foundNode.nextNode.data);
    }

    public void deleteInListByData(String data) {

        Node nodeToBeDeleted = head;
        while (nodeToBeDeleted != null) {

            if (nodeToBeDeleted.data.equals(data)) {

                if (nodeToBeDeleted.previousNode == null) {
                    nodeToBeDeleted.nextNode.previousNode = null;
                    head = head.nextNode;
                    //DELETING NODE AT HEAD

                    System.out.println("THE NODE AT HEAD DELETED");
                    return;
                } else if (nodeToBeDeleted.nextNode == null) {

                    //DELETING NODE AT TAIL
                    tail = nodeToBeDeleted.previousNode;
                    nodeToBeDeleted.previousNode.nextNode = null;
                    System.out.println("THE NODE AT TAIL DELETED");
                    return;
                } else {

                    //DELETING NODE ACCORDING (STRING) DATA
                    nodeToBeDeleted.previousNode.nextNode = nodeToBeDeleted.nextNode;
                    nodeToBeDeleted.nextNode.previousNode = nodeToBeDeleted.previousNode;
                    System.out.println(nodeToBeDeleted.data + " DATA DELETED");
                    return;
                }
            }

            //THIS STATEMENT WROTE TO PROVIDE LOOP (YOU CAN THINK LIKE INDEX (i,j,k...) AT FOR LOOP)
            nodeToBeDeleted = nodeToBeDeleted.nextNode;


        }
    }

    public void display() {
        Object firstElement, lastElement;
        if (head == null) {
            firstElement = " null";
        } else {
            firstElement = head.data;
        }
        if (tail == null) {
            lastElement = " null";
        } else {
            lastElement = tail.data;
        }


        System.out.println("First Node : " + firstElement + " Last Node: " + lastElement);
    }

}

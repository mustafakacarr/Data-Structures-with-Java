package SinglyLinkedList;

public class SLinkedListImpl {
    public ListNode head, tail;

    public SLinkedListImpl() {
        head = null;
        tail = null;
    }

    public void addToHead(String data) {
        ListNode listNode = new ListNode();
        listNode.data = data;
        listNode.nextNode = head;
        head = listNode;
        if (tail == null) {
            tail = listNode;
        }
    }

    public void addToTail(String data) {
        ListNode listNode = new ListNode();
        listNode.data = data;
        listNode.nextNode = null;
        if (head != null) {
            tail.nextNode = listNode;
            tail = listNode;
        } else {
            head = listNode;
            tail = listNode;
        }
    }

    public void listNodes() {
        ListNode currentNode = head;
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
        ListNode currentNode = head;
        if (head == null) {
            System.out.println("There is no any node");
        }
        ListNode foundNode = null;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                foundNode = currentNode;
            }

            currentNode = currentNode.nextNode;
        }
        System.out.println("The found value of data: " + foundNode.data + ". value of next one: " + foundNode.nextNode.data);
    }

    public void deleteInListByData(String data) {
        /*
       currentNode is the previous of nodeToBeDeleted field.
       So we have to be able to reach previous pointer for changing the pointing data.
         */
        ListNode currentNode = head;
        ListNode nodeToBeDeleted = null;

        while (currentNode != null) {
            nodeToBeDeleted = currentNode.nextNode;

            if (currentNode.data.equals(data)) {

                //DELETING NODE AT HEAD
                head = head.nextNode;
                System.out.println("THE NODE AT HEAD DELETED");
                return;
            } else if (nodeToBeDeleted.nextNode == null) {

                //DELETING NODE AT TAIL
                tail = currentNode;
                currentNode.nextNode = null;
                System.out.println("THE NODE AT TAIL DELETED");
                return;
            } else if (nodeToBeDeleted.data.equals(data)) {

                //DELETING NODE ACCORDING (STRING) DATA
                currentNode.nextNode = nodeToBeDeleted.nextNode;
                System.out.println("PREVIOUS DATA OF TO BE DELETED" + currentNode.data);
                System.out.println(nodeToBeDeleted.data + " DATA DELETED");
                return;
            }

    //THIS STATEMENT WROTE TO PROVIDE LOOP (YOU CAN THINK LIKE INDEX (i,j,k...) AT FOR LOOP)
            currentNode = currentNode.nextNode;
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

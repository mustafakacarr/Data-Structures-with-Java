import MultiplyLinkedList.MLinkedListImp;
import SinglyLinkedList.SLinkedListImpl;

public class Main {
    public static void main(String[] args) {
/*        SLinkedListImpl sLinkedList = new SLinkedListImpl();

        sLinkedList.addToHead("Ahmet");
        sLinkedList.addToHead("Mehmet");
        sLinkedList.addToTail("Hüseyin");
        sLinkedList.addToTail("Hüsnü");
        sLinkedList.deleteInListByData("Hüsnü");
        sLinkedList.listNodes();
*/

        //Also you can use the codes below to test program. They're going to provide you some instances like nodes, search etc.

//        THESE'RE FOR SINGLY LINKEDLIST


        SLinkedListImpl linkedListExmp = new SLinkedListImpl();
        for (int i = 8; i >= 1; --i) {
            linkedListExmp.addToHead(i + ". data");
            linkedListExmp.addToTail((i * 3) + ". data");
        }
        //Show the list
        linkedListExmp.listNodes();

        linkedListExmp.searchInList("18. data");
        linkedListExmp.deleteInListByData("21. data");
        linkedListExmp.display();




        /*
        THESE'RE FOR MULTIPLY LINKEDLIST


        MLinkedListImp linkedListExmp = new MLinkedListImp();
        for (int i = 8; i >= 1; --i) {
            linkedListExmp.addToHead(i + ". data");
           linkedListExmp.addToTail((i * 3) + ". data");
        }
        //Show the list
        linkedListExmp.listNodes();
        linkedListExmp.searchInList("18. data");
        linkedListExmp.deleteInListByData("8. data");
        linkedListExmp.listNodes();
        linkedListExmp.display();
        */


    }

}
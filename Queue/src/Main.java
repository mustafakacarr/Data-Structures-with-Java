import WithCircularArray.Queue;
import WithLinkedList.QueueLinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
  /*
      //THESE'RE MADE WITH CIRCULAR ARRAY

      Queue queue=new Queue(5);
        if (queue.isEmpty())
            System.out.println("Queue is empty");
        queue.enqueue(49);
        queue.enqueue(23);
        System.out.println("Front of the queue:"+ queue.dequeue());
        queue.enqueue(44);
        queue.enqueue(22);
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        if (queue.isEmpty())
            System.out.println("Queue is empty");
    */
        //THESE'RE MADE WITH LINKED LIST
        QueueLinkedList queue=new QueueLinkedList();
        if (queue.isEmpty())
            System.out.println("Queue is empty");
        queue.enqueue(49);
        queue.enqueue(23);
        System.out.println("Front of the queue:"+ queue.dequeue());
        queue.enqueue(44);
        queue.enqueue(22);
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        System.out.println("First item of the queue:"+ queue.dequeue());
        if (queue.isEmpty())
            System.out.println("Queue is empty");


    }
}
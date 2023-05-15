//import WithLinkedList.Stack;
import WithArray.Stack;

public class Main {
    public static void main(String[] args) throws Exception {


     /*   THESE'RE CREATED WITH ARRAYS. THAT'S WHY ITS NON-DYNAMIC.
        YOU CAN ENCOUNTER CAPACITY PROBLEMS BECAUSE OF ARRAY'S SIZE CANT BE CHANGED.
        WE COULD SOLVE IT AS DYNAMİC  BY LINKED LIST WHEN WE ENCOUNTER STUFF LIKE THAT.

       Stack stack = new Stack();
        if (stack.isEmpty())
            System.out.println("WithArray.Stack is empty");
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println(randomNumber);
            stack.push(randomNumber);
        }




        //AFTER PUSH
        if (stack.isEmpty())
            System.out.println("WithArray.Stack is empty");
        System.out.println("Top value: " + stack.top());

        System.out.println("Size of WithArray.Stack: " + stack.size);
        //AFTER POP
        System.out.println(stack.pop());
        System.out.println("Size of WithArray.Stack: " + stack.size);

*/

        /*
  THE CODES BELOW CONSIST OF LINKED LIST IMPLEMENTATION. SO YOU WON'T ENCOUNTER WITH CAPACITY PROBLEMS
        */

        Stack stack = new Stack();
        if (stack.isEmpty())
            System.out.println("Stack is empty");
        stack.push(49);
        stack.push(23);
        System.out.println("Top Value of Stack: "+ stack.pop());
        stack.push(44);
        stack.push(22);
        System.out.println("Top Value of Stack: "+ stack.pop());
        System.out.println("Top Value of Stack: "+ stack.pop());
        System.out.println("Top Value of Stack (Top method): "+ stack.top());
        System.out.println("Top Value of Stack: "+ stack.pop());
        if (stack.isEmpty())
            System.out.println("Stack is empty");

    }


}
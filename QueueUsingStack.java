import java.util.Stack;

/**
 * Created by abhinav on 20/01/17.
 *
 *  Implement Queue using two Stacks
 *   Algorithm
 *   enQueue(x)
     1) Push x to stack1

     deQueue(x)
      1) If both stacks are empty then error.
      2) If stack2 is empty
         While stack1 is not empty, push everything from stack1 to stack2.
      3) Pop the element from stack2 and return it.

  My implementation in java
 **/
class MyQueue{

    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    void enqueue(int x){

        s1.push(x);

    }
    int dequeue(){

        if(s1.isEmpty() && s2.isEmpty())  //if both stacks are empty show error
        {
            System.out.println("Invalid operation");
            return 0;
        }
        if(s2.isEmpty()) {  // only when stack 2 is empty put all values from stack 1 to stack 2

            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }

        int x=s2.pop();
       return x;


    }

    int peek()
    {
        return s2.peek();
    }

    boolean isEmpty()
    {
        return s1.isEmpty() && s2.isEmpty();
    }


}
public class QueueUsingStack {

    public static void main(String[] args) {

     MyQueue q=new MyQueue();
     q.enqueue(10);
     q.enqueue(12);
     q.enqueue(20);
     q.enqueue(76);
     q.enqueue(34);
        System.out.println("Value at top of queue "+q.dequeue());
     q.dequeue();
     q.dequeue();
        System.out.println("Value at top of queue "+q.dequeue());
        System.out.println("is queue empty? " +q.isEmpty());



    }
}

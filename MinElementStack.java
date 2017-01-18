/* Design a stack that supports getMin() in O(1) time and O(1) extra space */

import java.util.Stack;

/**
 * Created by abhinav on 18/01/17.
 */
class MyStack {

    Stack<Integer> s;
    Integer minEle;

    MyStack()
    {

      s=new Stack<Integer>();
    }
    void push(Integer x)
    {
       if(s.isEmpty()) {
           s.push(x);
           minEle=x;
       }
       if(x<minEle){
           s.push(2*x-minEle);
           minEle=x;
       }
       else
           s.push(x);

        System.out.println("Number inserted "+x);


    }
    void pop()
    {
        if(s.isEmpty())
            System.out.println("Stack is empty ");
        System.out.println("Top most element removed");
        Integer t=s.pop();
        if(t<minEle)
        {
            System.out.println(minEle);
            minEle=2*minEle-t;    //minimum element will change as top of stack is removed

        }
        else
            System.out.println(t);

    }
    void getMin()
    {
        if(s.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Minimum element in stack is "+minEle);

    }
    void peek()   //return topmost element of stack
    {
      if(s.isEmpty())
          System.out.println("Stack is empty ");
      Integer t=s.peek();
        System.out.println("Top most element is ");
      if(t<minEle)
          System.out.print(minEle);
      else
          System.out.println(t);


    }
}
class MinElementStack {

    public static void main(String[] args) {
        MyStack s=new MyStack();

        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();

    }
}

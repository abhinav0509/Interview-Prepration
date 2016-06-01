class StackByLinkedList{
  Node top;
  int size;
  class Node{
    int data;
    Node next;
    Node(int x)
    {
      data=x;
      next=null;
    }

  }
  void push(int x)
  {
    Node new_node=new Node(x);
    new_node.next=top;
    top=new_node;
    size++;


  }
  int pop()
  {
    if(top==null)
      System.out.println("\nStack is empty");
    int data=top.data;
    top=top.next;
    size--;
    return data;
  }
  int peek() //return topmost element
  {
   if(top==null)
      System.out.println("Stack is empty");
   return top.data;

  }
  boolean isEmpty()
  {
   return top==null;
  }
  void printStack()
  {
    Node temp=top;
    while(temp!=null)
    {
      System.out.print("\t"+temp.data);
      temp=temp.next;
    }
    System.out.println("\nThe size of stack is:"+size);

  }

  public static void main(String[] args) {
    StackByLinkedList llist=new StackByLinkedList();
    llist.push(10);
    llist.push(12);
    llist.push(55);
    llist.push(12);
    llist.push(23);
    llist.push(21);
    llist.push(4);
    llist.push(5);
    llist.printStack();
    int pop=llist.pop();
    System.out.println("\nThe popped element:"+pop);
    llist.printStack();
    System.out.println("The element on top of stack is:"+llist.peek());
    System.out.println("Stack empty?:"+llist.isEmpty());





  }




}

class DoublyLinkedList{
  static Node head;
 class Node{
   int data;
   Node prev;
   Node next;
    Node(int x)
   {
      data=x;
      prev=next=null;

   }

 }

 void push(int new_data) //insert at start
 {
     Node new_node=new Node(new_data);
     new_node.next=head;
     new_node.prev=null;
     if(head!=null)
        head.prev=new_node;
     head=new_node;
 }
 void insertAtEnd(int x)
 {
   Node new_node=new Node(x);
   Node last=head;
   if(head==null)
   {
     new_node.prev=null;
     head=new_node;
   }
   while(last.next!=null)
     last=last.next;
   last.next=new_node;
   new_node.prev=last;


 }
  void insertAfter(Node prev_node,int new_data)
  {
     if(prev_node==null)
       System.out.println("Invalid previous node address");
     Node new_node=new Node(new_data);

     new_node.prev=prev_node;
     new_node.next=prev_node.next;
     prev_node.next=new_node;

     if(new_node.next!=null)
       new_node.next.prev=new_node;

  }
  
  void printlist()
  {
     Node last=null;
     System.out.println("Traversal in forward direction");
     while(head!=null)
     {
       System.out.print(head.data+" ");
       last=head;
       head=head.next;
     }
     System.out.println();
     System.out.println("Traversal in backward direction");
     while(last!=null)
     {
       System.out.print(last.data+" ");
       last=last.prev;
     }
  }
   public static void main(String[] args) {
    DoublyLinkedList dl=new DoublyLinkedList();
    dl.push(12);
    dl.push(5);
    dl.push(7);
    dl.push(3);
    dl.push(6);
    dl.push(4);
    dl.insertAfter(head.next,33);
    //dl.printdoublyll();
    dl.insertAtEnd(77);
    dl.printlist();

   }



}

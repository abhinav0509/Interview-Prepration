import java.util.Stack;

/**
 * Created by abhinav
 */
public class AddNumberInLinkedList {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }
    public void appendNode(int x){
        Node new_node=new Node(x);

        if(head==null)
        {
            head=new_node;
            tail=head;
        }
        tail.next=new_node;
        tail=new_node;
    }
    public Node createLinkedList(int[] arr){

        if(head!=null)
            head=null;   //if head is pointing to some list make it null

        for (int i = 0; i < arr.length; i++) {
            appendNode(arr[i]);
        }

       return head;
    }
    public void printLinkedList(Node head)
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;

        }
        System.out.println("null");

    }

    public Node createLinkedList(Stack<Integer> s)
    {
         //if head is pointing to to some other list make it null
         if(head!=null)
         {
             head=null;
         }
         while(!s.empty())
         {
             appendNode(s.pop());

         }
        return head;



    }
    public Node addTwoLinkedList(Node head1,Node head2)
    {

        if (head1 == null)
        {
            return head2;
        }
        if (head2 == null)
        {
            return head1;
        }

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        Node temp = head1;
        while (temp != null)
        {
            s1.push(temp.data);
            temp = temp.next;
        }

        // push list2 into the second stack
        temp = head;
        while (temp != null)
        {
            s2.push(temp.data);
            temp = temp.next;
        }

        int sum = 0, carry = 0, value1, value2;

        // keep adding the popped digits to the sum until one of the stacks becomes empty
        // sum itself is stored in a stack
        while ((!s1.empty()) && (!s2.empty()))
        {
            value1 = s1.pop();
            value2 = s2.pop();

            sum   = (value1 + value2 + carry) % 10;
            carry = (value1 + value2 + carry) / 10;

            s3.push(sum);
        }

        // if stack1 still has some digits left, add those digits to the sum
        while (!s1.isEmpty())
        {
            value1 = s1.pop();

            sum   = (value1 + carry) % 10;
            carry = (value1 + carry) / 10;

            s3.push(sum);
        }

        // if stack2 still has some digits left, add those digits to the sum
        while (!s2.isEmpty())
        {
            value2 = s2.pop();

            sum   = (value2 + carry) % 10;
            carry = (value2 + carry) / 10;

            s3.push(sum);
        }

        // after adding digits from both the stack, if the remaining carry is greater than 0
        // add that carry to the sum
        if (carry > 0)
        {
            s3.push(carry);
        }

        // finally, from the resultant stack, which stores the sum create a new linked list
        // return this newly created linked list
        return createLinkedList(s3);



    }

    public static void main(String[] args) {

        AddNumberInLinkedList obj1=new AddNumberInLinkedList();

        int[] arr1={9,9,8,7};
        int[] arr2={9,9,7};

        Node head1=obj1.createLinkedList(arr1);
        Node head2=obj1.createLinkedList(arr2);

        obj1.printLinkedList(head1);
        obj1.printLinkedList(head2);

        Node result = obj1.addTwoLinkedList(head1, head2);

        System.out.print("Sum of given two Linked List \n");
        obj1.printLinkedList(result);







    }

}

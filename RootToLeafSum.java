
import java.util.ArrayList;
import java.util.List;

/**
 * Created by abhinav on 19/01/17.
 *
 *
 * Root to leaf path sum equal to a given number
 * Given a binary tree and a number, return true if the tree has a root-to-leaf path such that adding up all the values
 * along the path equals the given number. Return false if no such path can be found.
 *
 * Source geeksforgeeks
 * My java implementation
 *
 *
 *
 */
class Node{

    Node left,right;
    int data;

    Node(int d)
    {
      Node left=null;
      Node right=null;
      data=d;
    }

}
class RootToLeafSum{
    static Node root;
    Node insert(Node root,int d)
    {
        if(root==null) {
            Node new_node = new Node(d);
            root=new_node;
        }
        else if(root.left==null)
            root.left=insert(root.left,d);
        else
            root.right=insert(root.right,d);

        return root;
    }
    void preOrder(Node root)
    {
        if(root==null)
            return;
       System.out.print(root.data+" ");
       preOrder(root.left);
       preOrder(root.right);

    }
    boolean printPath(Node root, int sum, List<Node> path){
       if(root==null)
           return false;
       if(root.left==null && root.right==null){   //check for leaf node;
           if(root.data==sum){
               path.add(root);
               return true;
           }
           else
               return false;


       }
       if(printPath(root.left,sum-root.data,path) || printPath(root.right,sum-root.data,path)) //subtract sum from node value and proceed till leaf is found with remaining sum
       {
           path.add(root);
           return true;
       }


        return false;
    }
    public static void main(String[] args) {
        RootToLeafSum bt = new RootToLeafSum();
        root=bt.insert(root,10);
        bt.insert(root,15);
        bt.insert(root,5);
        bt.insert(root,7);
        bt.insert(root,19);
        bt.insert(root,20);
        bt.insert(root,4);
        bt.insert(root,3);
        System.out.println("Preorder of given tree");
        bt.preOrder(root);
        List<Node> result=new ArrayList<>();
        boolean isPresent=bt.printPath(root,22,result);


        if(isPresent){
            System.out.println("\nSum 22 is present in tree ? "+isPresent);
            System.out.println("The path from leaf to root is ");
            for (Node x : result) {
                System.out.print(x.data + "->");

            }
        }
        else
            System.out.println("Given sum is not present");



    }
}





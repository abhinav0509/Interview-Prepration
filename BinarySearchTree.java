class Node
{
  int data;
  Node left,right;

  Node(int d){
   data=d;
   left=right=null;

  }

}
class BinarySearchTree{
 static Node root;

 Node insert(Node root,int data)
 {

   if(root==null)
   {
    Node new_node=new Node(data);
    root=new_node;
   }
   else if(data<=root.data)
   {
     root.left=insert(root.left,data);

   }
   else{
     root.right=insert(root.right,data);
   }
  return root;
}
boolean search(Node root,int key)
{
   if(root==null)
    return false;
   if(root.data==key)
    return true;
   else if(key>=root.data) //go right
     return search(root.right,key);
   else //goleft
     return search(root.left,key);
}
int findMin(Node root)
{
  Node current=root;
  while(current.left!=null)
  {
    current=current.left;

  }
  return current.data;

}
int maxDepth(Node root)  //height of tree
{
  Node current=root;
  if(current==null)
    return -1;
  else{
     int ldepth=maxDepth(current.left);
     int rdepth=maxDepth(current.right);
     if(ldepth>rdepth)
     {
       return(ldepth+1);
     }
     else
     return rdepth+1;


    }
}
int size(Node root) //size means we have to calculate number of nodes in tree
{
  if(root==null)
     return 0;
  int lsize=size(root.left);
  int rsize=size(root.right);
  //return (size(root.left)+size(root.right)+1);
  return (lsize+rsize+1);


}

void printPreorder(Node root)
{
  if (root == null)
       return;
  System.out.print("\t"+root.data);
  printPreorder(root.left);
  printPreorder(root.right);
}
void printInorder(Node root)
{
 if (root == null)
      return;
 printPreorder(root.left);
 System.out.print("\t"+root.data);
 printPreorder(root.right);

}
void printPostorder(Node root)
{
  if (root == null)
       return;
  printPostorder(root.left);
  printPostorder(root.right);
  System.out.print("\t"+root.data);
}

boolean isBSTcheck(Node root)
{
  boolean result=isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  return result;



}
boolean isBST(Node root,int min,int max)
{
   if(root==null)
      return true;
   if(root.data<=min || root.data>max)
     return false;
   return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);

}

 public static void main(String[] args) {
   BinarySearchTree tree=new BinarySearchTree();
   //Node root=null;
   root=tree.insert(root,10);
   tree.insert(root,5);
   tree.insert(root,20);
   tree.insert(root,7);
   tree.insert(root,4);
   tree.insert(root,21);
   tree.insert(root,18);
   tree.insert(root,25);
   tree.insert(root,3);
   System.out.println("Preorder traversal of tree:");
   tree.printPreorder(root);

   System.out.println("\nPostorder traversal of tree:");
   tree.printPostorder(root);
   System.out.println("\nInorder traversal of tree:");
   tree.printInorder(root);
   System.out.println();
   System.out.println("Given key 4 present in tree? "+tree.search(root,4));
   System.out.println("Given key 77 present in tree? "+tree.search(root,77));
   System.out.println("The minimum value in tree is:"+tree.findMin(root));
   System.out.println("The maximum depth of tree is:"+tree.maxDepth(root));
   System.out.println("The size of tree is:"+tree.size(root));
   System.out.println("Given tree is binary search tree: "+tree.isBSTcheck(root));



}



}

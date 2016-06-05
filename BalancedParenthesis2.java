import java.util.Scanner;
import java.util.Stack;
class BalancedParenthesis2{
 private static Scanner in;
public static boolean areParenthesisBalanced(String exp){
 Stack<Character> stk=new Stack<Character>();
 for(int i=0;i<exp.length();i++)
 {
   if(exp.charAt(i)==')')
   {
    if(!stk.empty()&&stk.peek()=='(')
     stk.pop();
    else
     return false;
   }
   else if(exp.charAt(i)==']')
   {
    if(!stk.empty()&&stk.peek()=='[')
     stk.pop();
    else
     return false;
   }
   else if(exp.charAt(i)=='}')
   {
    if(!stk.empty()&&stk.peek()=='{')
     stk.pop();
    else
     return false;
   }
   else
   {
    stk.push(exp.charAt(i));
   }

  }
 return stk.empty();
}
public static void main(String[] args) {
 in = new Scanner(System.in);
 System.out.println("Enter the expression to evaluate:");
 String exp=in.nextLine();
 boolean result=areParenthesisBalanced(exp);
 System.out.println("Are pararenthesis balanced "+result);

}
}

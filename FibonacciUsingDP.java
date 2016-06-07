/*
Problem:Calcuate nth fibonacci using dynamic programming

Basic idea:
 In fibonacci using DP we avoid overlapping subproblems,by calculating same values again and again,for
 F(n) = F(n-1) + F(n-2), we need only the last 2 values of the series to find the next value.
 Hence, we do not need to store all subproblem solutions but only the previous 2 i.e.
 F(i-1) and F(i-2)

*/

class FibonacciUsingDP{
  public static int getFibonnaci(int n)
  {
     if(n<0)
       System.out.println("Invalid Argument");
     if(n==0||n==1)
        return n;

     int a=0,b=1,c=a+b;

    for (int i=2; i<=n;i++ ){
        c=a+b;
        a=b;
        b=c;
     }
     return c;
  }
  public static void main(String[] args) {
    System.out.println(getFibonnaci(6));
  }


}

/*
Time Complexity is O(n)
Space Complexity is O(1)
*/

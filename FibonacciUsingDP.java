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

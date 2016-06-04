class SquareRootWithoutInbuiltFunction{
    public static String findSquareRoot(int number){
       boolean isNegative=false;
       if(number<0)
       {
          number=-number;
          isNegative=true;

       }
       if(number==1)
       {
          return number+(isNegative?"i":"");
       }
       double start=0;
       double end=number;
       double previousMid=0;
       double mid=(start+end)/2;
       double diff=Math.abs(mid-previousMid);
       double precision=0.0005;
       while(mid*mid!=number && diff>precision)
       {
          if(mid*mid>number)
          {
             end=mid;
          }
          else
          {
            start=mid;
          }
          previousMid=mid;
          mid=(start+end)/2;
          diff=Math.abs(mid-previousMid);


       }
       return mid+(isNegative?"i":" ");


    }

   public static void main(String[] args){
      int number=-100;
      String result=findSquareRoot(number);
      System.out.println("Square root of "+number+"= "+result);

   }




}

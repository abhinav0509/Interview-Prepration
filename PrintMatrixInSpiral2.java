class PrintMatrixInSpiral2{

  public static void printSpiral(int[][] a,int m,int n){
     int top=0,bottom=m-1,right=n-1,left=0,dir=0,i;

     while(top<=bottom && left<=right)
     {
        if(dir==0)
        {
          for(i=top;i<=right;i++)
             System.out.print(a[top][i]+" ");

          top++;
          dir=1;

        }
        else if(dir==1)
        {
          for (i=top;i<=bottom;i++)
             System.out.print(a[i][right]+" ");

          dir=2;
          right--;

        }

        else if(dir==2)
        {
          for (i=right;i>=left;i--)
             System.out.print(a[bottom][i]+" ");

          dir=3;
          bottom--;

        }

        else if(dir==3)
        {
          for (i=left;i>=top;i--)
             System.out.print(a[i][left]+" ");

          dir=0;
          left++;

        }

     }
     System.out.println();


  }

  public static void main(String[] args) {
   int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSpiral(a,4,4);
  }


}

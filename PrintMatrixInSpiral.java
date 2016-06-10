class PrintMatrixInSpiral{
  public static void printSpiral(int a[][],int m,int n)
  {
     int k=0,l=0,i;
     /*
       k=starting row index
       m=ending row index
       l=starting column index
       n=ending column index
             1)
       ------------>
        1  2   3  4
             5)
           ---->
      | 5  6   7| 8 |
      |         |   |
  4)  | 9  10 11| 12| 2)
           <--      |
            7)      |
       13 14  15  16|
      <--------
          3)

      Spiral path to follow shown with arrow with sequence number.
     */


      while (k < m && l < n)
     {
         /* Print the first row from the remaining rows */
         for (i = l; i < n; ++i)
         {
             System.out.print(a[k][i]+" ");
         }
         k++;

         /* Print the last column from the remaining columns */
         for (i = k; i < m; ++i)
         {
             System.out.print(a[i][n-1]+" ");
         }
         n--;

         /* Print the last row from the remaining rows */
         if ( k < m)
         {
             for (i = n-1; i >= l; --i)
             {
                 System.out.print(a[m-1][i]+" ");
             }
             m--;
         }

         /* Print the first column from the remaining columns */
         if (l < n)
         {
             for (i = m-1; i >= k; --i)
             {
                 System.out.print(a[i][l]+" ");
             }
             l++;
         }
     }
     System.out.println();

  }
  public static void main(String[] args) {
    int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    printSpiral(a,4,4);

  }



}

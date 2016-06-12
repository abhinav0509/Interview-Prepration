/*
Problem
Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.

Source:InterviewBit

*/


import java.util.HashSet;
class FirstMissingPositiveInteger{
  public static void main(String[] args) {
     int[] arr={3,4,-1,1};
     //int[] arr={1,1,1,1};  //test cases

     int result=findMissingInteger2(arr);
     System.out.println(result);
   }
   /*
   public static int findMissingInteger(int[] arr            //Time Complexity:O(n)
     HashSet<Integer> hashset=new HashSet<Integer>();        //Space Complexity:O(n)
     for(int n:arr)
     {
       hashset.add(n);
     }
     int count=1;
     while(hashset.contains(count)){count++;}
     return count;
  }*/

  public static int findMissingInteger2(int[] arr) {           //Time Complexity:O(n)
                                                              //Space Complexity:O(n)

     int max=0;
     /*
       find max element in array
     */
     for(int i=0;i<arr.length;i++)
     {
        if (arr[i]>max)
            max=arr[i];
     }

     int[] occur=new int[max+1];
     /*
       mark 1 in occur array at indexes equal to arr[i]
     */
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>0)
         {
            occur[arr[i]]=1;
         }
     }
     /*
        check the elements of occur array for value 0 which means the number is first missing positive integer.
     */

     for(int i=1;i<occur.length;i++)
     {
        if(occur[i]==0)
          return i;


     }
     return occur.length;

  }




}

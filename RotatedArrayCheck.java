/*Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array.
Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}*/

class RotatedArrayCheck{

     public static void main(String[] args) {
        int[] arr1={1,2,3,5,6,7,8};
        int[] arr2={5,6,7,8,1,2,3};

        System.out.println("Are both arrays rotated pairs? "+isRotatedPair(arr1,arr2));


     }
     public static boolean isRotatedPair(int[] arr1,int[] arr2)
     {


         int i=0;
         int j=0;
         int length=arr2.length;
         for(i=0;i<arr1.length;i++)
         {
            if(arr2[i]==arr1[0])
               break;

         }
         j=i;
         i=0;
         while(i<length)
         {
           if(arr1[i]!=arr2[j])
           {
              return false;
           }
           j=(j+1)%length;    //index j should be rotated after length and begin from start to compare further
           i++;

         }
         return true;

     }


}
//Time complexity O(n)

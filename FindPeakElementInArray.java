/*
Problem:Given an array of size n, find a peak element in the array. Peak element is the element which is greater than or equal to its neighbors.
For example - In Array {1,4,3,6,7,5}, 4 and 7 are peak elements. We need to return any one peak element.

Boundary conditions which are not taken care of in this code

If array is sorted in ascending order then last element will be peak element.
If array is sorted in descending order then first element will be peak element.
if array has all same element [5,5,5,5] then any index will be peak element.


*/

class FindPeakElementInArray{

  public static void main(String[] args)
  {
    int[] arr={5,10,15,25,30,45,65,50,35,1};

    int result=findPeak(arr);
    System.out.println("The peak element is at index "+result);  //output index 6

  }
  public static int findPeak(int[] arr)
  {
    int n=arr.length;
    int start=0,end=n-1,mid,result=0;

    while(start<=end)
    {
      mid=(start+end)/2;
      if((arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1])){
         result=mid;    /* mid is peak element,return mid*/
         break;
      }
      else if(arr[mid]<arr[mid+1]){  /* Search the peak element in the right half from mid*/
         start=mid+1;
      }
      else{
         end=mid-1;        /*Search peak element in left half from mid*/
       }


    }
    return result;
  }




}

/*
Time complexity:O(logn)
Space complexity:O(1)

*/

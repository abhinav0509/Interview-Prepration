/*
Problem: Given a sorted integer array which is rotated any number of times and an integer num,
find the index of num in the array.
If not found, return -1.

*/

class SearchElementInRotatedSortedArray{
  public static int findPivot(int[] arr)
  {
      int start=0,end=arr.length-1,mid=0;
      while(start<=end)
      {
        mid=(start+end)/2;
        if(arr[mid]>arr[mid+1])
        {
          break;
        }
        else if(arr[start]<=arr[mid]) //array is sorted till mid index look in second half for pivot index
        {
           start=mid+1;
        }
        else
        {
           end=mid-1;  //look for pivot index in first half
        }

      }
      return mid+1;
  }

  public static int binarySearch(int[] arr,int start,int end,int key)
  {
    while(start<=end)
    {
      int mid=(start+end)/2;
      if(arr[mid]==key)
        return mid;
      else if(key>arr[mid])
         start=mid+1;
      else
          end=mid-1;

    }
    return 0;

  }
  public static int findElementInRotatedSortedArray(int arr[],int num){
     if(arr.length==0)
       return -1;
     int pivot=findPivot(arr); //pivot is minimum value in rotated array.
     if(pivot>0 && num>=arr[0] && num<=arr[pivot-1])
        return binarySearch(arr,0,pivot-1,num);
     else
        return binarySearch(arr,pivot,arr.length-1,num);

  }

  public static void main(String[] args) {

     int arr[]={73,85,94,21,27,34,47,54,66};

     System.out.println("Element found at index "+findElementInRotatedSortedArray(arr,54));


  }



}
/*
Time complexity:O(logn)
Space complexity:O(1)
*/

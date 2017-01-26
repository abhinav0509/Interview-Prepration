import java.util.Arrays;

/**
 * Created by abhinav on 26/01/17.

 Count all distinct pairs with difference equal to k

 Given an integer array and a positive integer k, count all distinct pairs with difference equal to k.

 Question source: hackerank pairs problem

 Examples:

 Input: arr[] = {1, 5, 3, 4, 2}, k = 3
 Output: 2
 There are 2 pairs with difference 3, the pairs are {1, 4} and {5, 2}

 Input: arr[] = {8, 12, 16, 4, 0, 20}, k = 4
 Output: 5
 There are 5 pairs with difference 4, the pairs are {0, 4}, {4, 8},
 {8, 12}, {12, 16} and {16, 20}




 Algorithm

     1)Sort the array arr
     2)Take two pointers, l and r, both pointing to 1st element
     3)Take the difference arr[r] – arr[l]
     4)If value diff is K, increment count and move both pointers to next element
     5)if value diff > k, move l to next element
     6)if value diff < k, move r to next element
     7)return count

 My java implementation
 */
public class CountPairWithDiff {
    static int countPairs(int arr[],int k)
    {
       Arrays.sort(arr);
       int count=0;
       int l=0;
       int r=0;
       int n=arr.length;
       while(r<n) {
           if (arr[r] - arr[l] == k) {
               count++;
               r++;
               l++;
           }

          else if(arr[r] - arr[l] > k)
              l++;
          else
              r++;

       }
       return count;
    }
    public static void main(String[] args) {
       int arr[]={1,5,3,4,2};
       int k=2; //difference to observe
       int result=countPairs(arr,k);
        System.out.println("The number of pairs with required diff are "+ result);
    }
}

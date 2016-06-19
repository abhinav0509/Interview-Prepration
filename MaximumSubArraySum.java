/*
Given an array of unordered positive and negative integers, find the maximum subarray sum in the array.
For example:
Array: {2, -10, -5, 1, -4, 6, 0, -7, 8}
Output:
Maximum subarray sum is 9
Array:{-500}
Output:-500

*/

class MaximumSubArraySum{
  public static int findMaximumSum(int[] input)
  {
        int curSum = 0;
        int maxSum = 0;
        boolean hasAllNegativeNumbers = true;
        int maxNegativeSum = Integer.MIN_VALUE;  //intialise maxNegativeNumber to minimun Integer value
        for(int i = 0; i < input.length; i++) {
            if(hasAllNegativeNumbers && input[i] >= 0) {
                hasAllNegativeNumbers = false;
            } else if(hasAllNegativeNumbers && input[i] < 0 && maxNegativeSum < input[i]) {
                maxNegativeSum = input[i];  //in case of all negative values in input array return Maximum greatest one.
            }

            curSum += input[i];  //add the consecutive elements from input array as we iterate

            if(curSum < 0) {    //if curSum becomes less than 0 intialise it 0 again
                curSum = 0;
            }
            if(maxSum < curSum) {
                maxSum = curSum;   //When curSum is greater than maxSum,we update it
            }
        }
        return hasAllNegativeNumbers ? maxNegativeSum : maxSum;  //if array has all negative numbers return maxNegativeSum or else maxSum
    }



  public static void main(String[] args)
  {
     int[] input={2,-10,-5,1,-4,6,0,-7,8};
     //int[] input={-500};

     int result=findMaximumSum(input);
     System.out.println("Maximum sum is "+result);  //output 8

  }


}

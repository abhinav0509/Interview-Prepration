/*
Given a list of non negative integers, arrange them such that they form the largest number.
Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Asked in Amazon source InterviewBit

*/

class LargestNumberCombinationInArray{

 public static void main(String[] args) {
   int[] arr={3,30,34,5,9};
   shuffle(arr);
 }
 public static void shuffle(int[] arr){
  String result="";
  for(int i=0;i<arr.length;i++)
  {
     for(int j=0;j<arr.length-i-1;j++)
     {
         if(!isLess(arr[j],arr[j+1])){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
         }
     }
  }
  for(int k=0;k<arr.length;k++)
  {
     result=result+arr[k];
  }
  System.out.println(result);

 }
 public static boolean isLess(int a,int b)
 {
   String str1=""+a+b;
   String str2=""+b+a;

   return Integer.parseInt(str1)>Integer.parseInt(str2);

 }



}

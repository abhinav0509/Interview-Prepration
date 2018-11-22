/*
Union and Intersection of two sorted arrays
Given two sorted arrays, find their union and intersection.

Example:

Input : arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
Output : Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}

Input : arr1[] = {2, 5, 6}
        arr2[] = {4, 6, 8, 10}
Output : Union : {2, 4, 5, 6, 8, 10}
         Intersection : {6}


*/
import java.util.*;

class UnionIntersectionofArray{

 public static void UnionArray(int arr1[],int arr2[]){

  int m=arr1.length;
  int n=arr2.length;

  int i=0,j=0;
  while(i<m && j<n){

    if(arr1[i]<arr2[j]){
      System.out.print(arr1[i++]+" ");
    }
    else if(arr2[j]<arr1[i]){
      System.out.print(arr2[j++]+" ");
    }
    else{
       System.out.print(arr2[j++]+" ");
       i++;
      }

  }
   while(i<m){
    System.out.print(arr1[i++]+" ");
    }
    while(j<n){
     System.out.print(arr2[j++]+" ");
     }

   System.out.println();
 }

 public static void printIntersection(int arr1[],int arr2[]){
  int i=0,j=0;
  int m=arr1.length;
  int n=arr2.length;

  while(i<m && j<n){
    if(arr1[i]<arr2[j]){
      i++;
    }
    else if(arr1[i]>arr2[j]){
     j++;
    }
    else{
      System.out.print(arr2[j++]+" ");
      i++;
     }


  }


 }

public static void main(String[] args) {

      int arr1[] = {1, 2, 4, 5, 6};
      int arr2[] = {2, 3, 5, 7};

    UnionArray(arr1, arr2);
    printIntersection(arr1,arr2);

}



}

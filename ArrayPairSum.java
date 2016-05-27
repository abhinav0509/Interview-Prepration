/**
 * Created by abhinav on 25/05/16.
 */
//Find a pair of elements from an array whose sum equals a given number

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class ArrayPairSum {


    public static void main(String[] args) {

        int []a = {2,45,7,3,5,1,8,9};
        printSumPairs(a,10);
        //ArraysSumSort(a,10);

    }
    /*public static void ArraysSumSort(int[] a,int sum)   //0(n*n) approach
    {
        //ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arr));
        //ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
        Arrays.sort(a);
        int l=0;
        int r=a.length-1;

        while(l<r)
        {
          if(a[l]+a[r]==sum)
              System.out.println(a[l]+"+"+a[r]);
          else if(a[l]+a[r]<sum)
              l++;
          else
              r++;

        }



    }*/


     public static void printSumPairs(int []input, int k){   //O(n)

        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for(int i=0;i<input.length;i++){

            if(pairs.containsKey(input[i]))
                System.out.println(input[i] +", "+ pairs.get(input[i]));
            else
                pairs.put(k-input[i], input[i]);
        }
        //System.out.println(pairs);


    }
}

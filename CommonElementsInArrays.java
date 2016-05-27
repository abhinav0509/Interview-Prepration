import java.util.HashMap;

/**
 * Created by abhinav on 27/05/16.
 */
//Find the common elements of 2 int arrays.

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] arr1={10,5,88,99,132,15,12,200};
        int[] arr2={11,50,100,210,132,10,99,13};
        int count=0;

        HashMap<Integer,Integer> hashMap=new HashMap<Integer,Integer>();

        for (int i=0;i<arr1.length;i++)
        {
            int temp=arr1[i];


            if(hashMap.containsKey(temp)) {
                count=hashMap.get(temp);
                count=count+1;
                hashMap.put(temp, count);
            }
            else
            {
                hashMap.put(temp,1);
            }

        }
        System.out.println("The common elements in arrays are:");
        for (int j=0;j<arr1.length;j++)
        {
            if(hashMap.containsKey(arr2[j]))
            {
                System.out.print(arr2[j]+" ");
            }
        }

    }
}

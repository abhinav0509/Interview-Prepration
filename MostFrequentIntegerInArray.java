import java.util.HashMap;

/**
 * Created by abhinav on 24/05/16.
 */
public class MostFrequentIntegerInArray {
    public static void main(String[] args) {
        int[] arr={10,5,7,3,10,3,66,10,7,10};

        HashMap<Integer,Integer> hashMap=new HashMap<Integer, Integer>();
        int max=1;
        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            int current=arr[i];

            if(hashMap.containsKey(current))
            {

                int count=hashMap.get(current);
                count=count+1;
                hashMap.put(current,count);

                if(count>max){
                        max=count;
                        temp=current;
                }


            }
            else
            {
                hashMap.put(current,1);
            }

        }
        System.out.println("Most repeated integer in array is:"+temp);


    }




}

//write a function that prints binary of a decimal number

/**
 * Created by abhinav on 27/05/16.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        int num=140;
        int decimal=num;
        int[] binary=new int[25];
        int index=0;

        while(decimal>0)
        {
           binary[index++]=decimal%2;
           decimal=decimal/2;

        }
        for (int i = index-1; i>=0; i--) {
            System.out.print(binary[i]);
        }



    }
}

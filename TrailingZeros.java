/**
 * Created by abhinav on 19/05/16.
 */
import java.util.*;

class TrailingZeros{

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=in.nextInt();

        System.out.println("Trailing Zeros in "+n+"! = "+countTrailingZeros(n));
    }
    public static int countTrailingZeros(int n){
        int count=0;

        for(int i=5;n/i>=1;i=i*5)
        {

            count=count+n/i;

        }
        return count;

    }



}

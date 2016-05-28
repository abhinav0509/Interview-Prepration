/**
 * Created by abhinav on 27/05/16.
 */
public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        System.out.println(multiply(10,5));
    }
    public static int multiply(int x,int y)
    {
        if(y==0){
            return 0;
        }
        if(y>0){
            return x+multiply(x,y-1);
        }
        if(y < 0 ){
	       return -multiply(x, -y);
        }    

       return 1;
    }

}

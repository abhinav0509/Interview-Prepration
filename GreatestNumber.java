import java.util.Scanner;


public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=in.nextInt();
		int greatestNum=rearrange(num);
		System.out.println(greatestNum);

	}
  
	public static int rearrange(int a){
		int digitcount=0;
		int[] bucket=new int[10];
		int currentNumber=a;
		int modNumber=0;
		int numOfDigits=0;
		
		while(currentNumber>0)
		{                                        //currentNumber=286
			modNumber=currentNumber %10;         //modNumber=286%10=6 
			                                     //bucket[6]=1; 
			bucket[modNumber]++;                 //currentNumber=28;(286/10)
			currentNumber=currentNumber/10;      
			numOfDigits++;
			
			
		}
		int largestNum=0;
		for(int i=9;i>=0;i--){
			
			for(int j=0;j<bucket[i];j++){
				
				largestNum=largestNum*10+i;
				
			}
			
			
		}
		
		
		return largestNum;
	}
}
/*Another approach using string
   private static int largestNumber(int data) {
    int num = data;
    int[] times = new int[10];
    while (num != 0) {
        if (num == 0) {
            break;
        }
        int val = num % 10;
        times[val]++;
        num /= 10;
    }
    String largestNumber = "";
    for (int i = 9; i >= 0; i--) {
        for (int j = 0; j < times[i]; j++) {
            largestNumber += i;
        }
    }
    return Integer.parseInt(largestNumber);
}
 */

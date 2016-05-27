import java.util.HashMap;
import java.util.Scanner;


public class FirstNonRepeated1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String:");
		
		String input=sc.nextLine();
		
		HashMap<Character,Integer> hashmap=new HashMap<Character,Integer>();
		
		int length=input.length();
		
		for(int i=0;i<length;i++)  
		{
			char c=input.charAt(i);
			
			if(hashmap.containsKey(c))
			{
				hashmap.put(c,hashmap.get(c)+1);
				
			}
			else
			{
			  hashmap.put(c, 1); 	
			}	
			
			
			
		}
		
		for(int i=0;i<length;i++)
		{
			char c=input.charAt(i);
			if(hashmap.get(c)==1){
			    System.out.println(c);	
				
		     }
			
				 
			
		}	
		
		
		

	}

}

/*
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

Problem Source geeksforgeeks

My java implementation

*/
class ReverseWithoutSpecialChar{

 static boolean isAlphabet(char x)
 {
   if((x>='A' && x<='Z') || (x>='a' && x<='z'))
     return true;
   return false;
 }

public static void reversestr(String str)
{
   int l=0;
   int r=str.length()-1;
   char charArray[]=str.toCharArray();
   //char temp[]=new char[str.length];
   while(l<r)
   {
      if(!isAlphabet(charArray[l]))
          l++;
      else if(!isAlphabet(charArray[r]))
          r--;
      else
         {
          char temp=charArray[l];
          charArray[l]=charArray[r];
          charArray[r]=temp;
          l++;
          r--;

         }
   }
   for(char c:charArray)
     System.out.print(c);

   System.out.println();
}
public static void main(String[] args) {
 String str="abc!!dbf..x";
 System.out.println(str);
 reversestr(str);
}


}

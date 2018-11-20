/*
Reverse an array without affecting special characters
Given a string, that contains special character together with alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’),
reverse the string in a way that special characters are not affected.

Examples:

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.
Only subsequence "abc" is reversed

Input:   str = "Ab,c,de!$"
Output:  str = "ed,c,bA!$"

question source:geeksforgeeks
*/


import java.util.*;

class ReverseArrayWithoutSpecial{

     public static String reverseCharacters(char charArray[])
     {
        int len=charArray.length;
        int l=0;
        int r=len-1;
        while(l<r){
         if(!Character.isAlphabetic(charArray[l]))
           l++;
         else if(!Character.isAlphabetic(charArray[r]))
            r--;
         else
         {
            char temp=charArray[r];
            charArray[r]=charArray[l];
            charArray[l]=temp;
            l++;
            r--;

         }



        }
        String result=new String(charArray);
        return result;
     }

     public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input "+ str);

        System.out.println("Reverse String " +reverseCharacters(charArray));
     }




}

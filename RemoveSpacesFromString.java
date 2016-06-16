/*
 Problem
 Given a string of characters consisting of 0 or more spaces,
 remove all the spaces from this given string.
 Separation of spaces from other characters should be done in-place(without using extra space).
 Expected time complexity is O(n)

 "  This is   Spartaa!  " should return "Thisissparta!"


*/

import java.util.Arrays;
class RemoveSpacesFromString{

  public static void main(String[] args) {
    String str="  This  is Spartaa!  ";
    String nospace=removeSpaces(str);
    System.out.println(str+"becomes "+ nospace);
  }
  public static String removeSpaces(String str)
  {
     char[] charArray=str.toCharArray();
     int numSpaces=0;
     for(int i=0;i<charArray.length;i++)  //traverse the char array till end
     {
       if(charArray[i]==' ')
       {
          numSpaces+=1;   //count number of spaces
       }
       else
       {
         charArray[i-numSpaces]=charArray[i];    //if its non space character shift it to left by subtracting currentindex-numspaces
       }

     }
     charArray=Arrays.copyOf(charArray,charArray.length-numSpaces);  //at end all the spaces are on the right of array
     return new String(charArray);

  }



}

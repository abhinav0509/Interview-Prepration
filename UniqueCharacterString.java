import java.util.HashSet;

class UniqueCharacterString{
 public static void main(String[] args) {
    HashSet<Character> hashset=new HashSet<Character>();
    //Scanner in=new Scanner(System.in);
    String str=args[0];
    boolean unique=false;
    for(int i=0;i<str.length();i++)
    {
       unique=hashset.add(str.charAt(i));
       if(!unique){
          break;
       }
    }
    System.out.println("Given string  "+str+" has unique Characters? "+unique);



 }



}

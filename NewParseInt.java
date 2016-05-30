import java.util.HashMap;

class NewParseInt{

 public static HashMap<Character,Integer> hashmap=new HashMap<Character, Integer>();
  public static void main(String[] args) {
     String strint="6654";
     hashmap.put('0',0);
     hashmap.put('1',1);
     hashmap.put('2',2);
     hashmap.put('3',3);
     hashmap.put('4',4);
     hashmap.put('5',5);
     hashmap.put('6',6);
     hashmap.put('8',8);
     hashmap.put('9',9);

     System.out.println(hashmap);
     System.out.println(stringToInt(args[0]));

  }

  public static int stringToInt(String input){
   int curr = 0;
   for (int i=0; i<input.length();i++ ) {
      char c=input.charAt(i);
      int next =toInt(c);
      curr = curr*10+next;
   }
   return curr+1;
  }
  public static int toInt(char input){
    return hashmap.get(input);
  }


}

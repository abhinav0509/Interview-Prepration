class MyParseInt{

  public static void main(String[] args) {
    String str="11212";
    int num=0;
    for (int i=0;i<str.length();i++) {
       if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
       {
         num=num*10+((int)str.charAt(i)-48);  //subtract 48 which is ASCII of 0 to get actual digit
       }
       else
       {
          System.out.println("Invalid Number");
       }

    }
    System.out.println(num+1); //added 1 to check if string is actually converted to integer.
  }



}

import java.util.Scanner;

public class TheForgetfulMachine
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Give me a word!");
      String word = kb.next();
      System.out.println(word);
      
      System.out.println("Give me a second word!");
      String word2 = kb.next();
      System.out.println(word2);
      
      System.out.println("Great, now your favorite number?");
      int num = kb.nextInt();
      System.out.println(num);
      
      System.out.println("And you second-favorite number...");
      int num2 = kb.nextInt();
      System.out.println(num2);
   }//end main

}//end class
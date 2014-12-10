import java.util.Scanner;

public class NameAgeSalary
{
   public static void main(String [] args)
   {
      Scanner kb = new Scanner(System.in);
      
      System.out.println("Hello. What is your name? ");
      String name = kb.nextLine();
      
      System.out.println("Hi, " + name + "!\t How old are you?");
      int age = kb.nextInt();
      
      System.out.println("So you're " + age + ", eh?\t That's not old at all!");
      System.out.println("How much do you make, " + name + "?");
      double num = kb.nextDouble();
      
      System.out.println(num + "!\t I hope that's per hour and not per year! LOL!");
   }//end main
}//end class
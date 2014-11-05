import java.util.Scanner;
import java.util.*;

public class StudyTableRecorder
{
   private static Scanner kb = new Scanner(System.in);
   
	public static void main(String []args)
	{
		
		
      //	public Active(int hL, int hR, int hD, int mL, 
      //                 int mR, int mD, String n)

		Active newActive = new Active();
      AssociateMember newAM = new AssociateMember();
		
		System.out.println(newActive);
      System.out.println("\n");
		System.out.println(newAM);
      
      
	}
   
   public static void displayMenu()
   {
      System.out.println("Select from the options below");
      System.out.println("------------------------------");
      System.out.println("1) Create a new Active");
      System.out.println("2) Create a new Associate Member");
      System.out.println("3) Create a 
   }
   public static Active createNewActive(int hL, int hR, int hD, int mL, int mR, int mD, String n)
   {
      System.out.println("Creating new Active.");
      Active newActive; 
      
      System.out.println("Enter your name: ");
      n = kb.nextLine();
      System.out.println("Enter the Hours Required for this Active Member: ");
      hR = kb.nextInt();
      System.out.println("Enter the Hours Left for this Active Member: ");
      hL = kb.nextInt();
      System.out.println("Enter the Hours Done for this individual: ");
      hD = kb.nextInt();
      System.out.println("Enter the Minutes Required for this Active Member: ");
      mR = kb.nextInt();
      System.out.println("Enter the Minutes Left for this individual: ");
      mL = kb.nextInt();
      System.out.println("Enter the Minutes Done for this individual: ");
      mD = kb.nextInt();
      
      newActive = new Active(hR, hL, hD, mR, mL, mD, n);
      
      return newActive;
   }
	
	

}
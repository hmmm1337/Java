// Bennett Siegel
// CS110
// User Input PrintName

import java.util.Scanner;

public class UserInputPrintName
{
   public static void main(String [] args)
   {
      // Variables
      String fname, lname;
      Scanner input = new Scanner(System.in);
      
      // User Input
      System.out.print("First: ");
      fname = input.nextLine();
      System.out.print("Last: ");
      lname = input.nextLine();
      
      // Print Name
      System.out.print(fname + " " + lname);
   }
}
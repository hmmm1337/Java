// Bennett Siegel
// CS110
// User Input Addition

// Import the user-input library "Scanner".
import java.util.Scanner;

public class UserInputAddition
{
   public static void main(String [] args)
   {
      // Variables.
      int input1, input2, result;
      // Set up keyboard input.
      Scanner keyboard;
      keyboard = new Scanner(System.in);
      
      // Prompt user input.
      System.out.print("First Input: ");
      input1 = keyboard.nextInt();
      System.out.print("Second Input: ");
      input2 = keyboard.nextInt();
      
      // Run addition operation and display result.
      result = input1 + input2;
      System.out.print(result);   
   }
}
   
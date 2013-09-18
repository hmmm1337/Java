// Bennett Siegel 
// CS 110
// Conversion Program

import java.util.Scanner;

public class ConversionProgram
{
   public static void main(String [] args)
   {
      
      
      // Variables
      double inputMeters;
      int menuChoice = 0;
            
      // Create input scanner.
      Scanner input = new Scanner(System.in);
      
      // Prompt user for initial meters.
      System.out.print("Enter a distance in meters: ");
      inputMeters = input.nextDouble();
      
      // Error check: Meters > 0
      while(inputMeters < 0)
      {
         System.out.println("Error: Enter a positive value for meters.");
         System.out.print("Enter a distance in meters: ");
         inputMeters = input.nextDouble();
      }
      
      
      // Prompt menu choice.
      menu();
      menuChoice = input.nextInt();
      
      // Continue looping through menu until 4 is entered.
      while(menuChoice != 4)
      {
         
               
            // Use distance methods on menuChoice-input 1-3 and reprompt menu/menuChoice.
            if(menuChoice == 1)
            {
               showKilometers(inputMeters);
               menu();
               menuChoice = input.nextInt(); 
            }
            if(menuChoice == 2)
            {
               showInches(inputMeters);
               menu();
               menuChoice = input.nextInt(); 
            }
            if(menuChoice == 3)
            {
               showFeet(inputMeters);
               menu();
               menuChoice = input.nextInt(); 
            }
         
      
      // Exit program if menu Choice = 4.   
      }
      System.out.println("Bye!");

     
      
   }
   public static void showKilometers(double meters)
   {
      double kilometers;
      kilometers = meters * 0.001;
      System.out.println(kilometers);
   }
   
   public static void showInches(double meters)
   {
      double inches;
      inches = meters * 39.37;
      System.out.println(inches);
   }
   
   public static void showFeet(double meters)
   {
      double feet;
      feet = meters * 3.281;
      System.out.println(feet);
   }
   
   public static void menu()
   {
      System.out.println("1. Convert to kilometers.");
      System.out.println("2. Convert to inches.");
      System.out.println("3. Convert to feet.");
      System.out.println("4. Quit the program.");
      System.out.print("Enter your choice: ");
   }

}
   
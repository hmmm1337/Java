// Bennett Siegel
// CS 110
// Present Value Program

import java.util.Scanner;

public class PresentValue{
   
   public static void main(String [] args)
   {
   
      // Variables
      double futureIn, interestIn, yearsIn, total;
      
      // Create Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user for future, interest and year values.
      System.out.println("This program for calculating present value based on the equation:");
      System.out.println("P = F / (1 + r)^n");
      
      // Enter Dollars.
      System.out.print("Enter future value in dollars: ");
      futureIn = input.nextDouble();
      
      // Enter Interest.
      System.out.print("Enter interest value in percent: ");
      interestIn = input.nextDouble();
      
      // Enter Years.
      System.out.print("Enter years value: ");
      yearsIn = input.nextDouble();
      
      
      // Call method presentValue.
      total = presentValue(futureIn, interestIn, yearsIn);
      
      // Format and print result.
      System.out.printf("You would need to invest $%.2f", total);
   }
   
   public static double presentValue(double future, double interest, double years)
   {
      // Variables 
      double presentValue;
      double percent;
      
      // Convert percent to decimal.
      percent = interest/100;
      
      // Run the present value equation.
      presentValue = future / (Math.pow((1 + percent), years));
   
      return presentValue;
   
   
   }
   
}
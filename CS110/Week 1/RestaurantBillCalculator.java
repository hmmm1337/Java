// Bennett Siegel
// CS110
// Restaurant Bill Calculator

import java.util.Scanner;

public class RestaurantBillCalculator
{
   public static void main(String [] args)
   {
      // Constants
      final double TAX_RATE = 6.75;
      final double TIP_RATE = 15;
      
      // Variables
      double mealCharge, tax, tip, total;
      
      // Scanner
      Scanner input = new Scanner(System.in);
      
      // Meal Cost
      System.out.print("Charge for meal: ");
      mealCharge = input.nextDouble();
      
      // Calculate Tax
      tax = mealCharge * (TAX_RATE/100);
      
      // Calculate Tip
      tip = (mealCharge + tax) * (TIP_RATE/100);
      
      // Calculate Total
      total = mealCharge + tax + tip;
      
      // Print and Format
      System.out.printf("%-15s%6.2f%n", "Meal Charge", mealCharge);
      System.out.printf("%-15s%6.2f%n", "Tax", tax);
      System.out.printf("%-15s%6.2f%n", "Tip", tip);
      System.out.printf("%-15s%6.2f%n", "Total", total);
      
   }
}

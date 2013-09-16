// Bennett Siegel
// CSS 110
// CH 5 # 4

import java.util.Scanner;

public class PennyDoubleCalculator
{
   public static void main(String [] args)
   {
      
      // Variables
      int daysWorked;
      double totalPay;
      
      // Constants
      final double PENNY = 0.01;
      
      // Create scanner.
      Scanner input = new Scanner(System.in);
      
      // Get user input.
      System.out.print("Enter days worked: ");
      daysWorked = input.nextInt();
      
      // Check that days >= 0.
      if(daysWorked >= 0)
      {
          totalPay = PENNY*(Math.pow(2, (daysWorked - 1)));
          System.out.println("Total Pay for " + daysWorked + " days worked: " + totalPay);
      }
   }
}
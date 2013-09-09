// Bennett Siegel
// CS110
// Homework #2
/* 
Program to calculate current ISP bill based on hours used and
then display potential prices for the other available plans.
*/

import java.util.Scanner;

public class InternetBillCalculator
{
   public static void main(String [] args)
   {
      // Variables
      String planString;
      double basePrice, hourlyPrice, planHours, hoursUsed, billTotal,
      bBasePrice, bHourlyPrice, bPlanHours, cBasePrice, cHourlyPrice,
      aBasePrice, aHourlyPrice, aPlanHours, aBillTotal, bBillTotal,
      cBillTotal;
      
      // Scanner
      Scanner input = new Scanner(System.in);
      
      // Display plan type and prompt user for data.
      System.out.println("A: 10 Hours at $9.95 additional $2.00.");
      System.out.println("B: 20 Hours at $13.95 additional $1.00.");
      System.out.println("C: Unlimited at $19.95.");
      System.out.print("Enter plan (A, B or C): ");
      planString = input.nextLine();
      planString = planString.toLowerCase(); // Convert to lowercase.
      
      // Check to see if input equals A, B or C.
      if(planString.equals("a") || planString.equals("b") || planString.equals("c"))
      {
      
      
      System.out.print("Enter hours used: ");
      hoursUsed = input.nextDouble();
      
      // Initialize switch statement variables.
      basePrice = 0;
      hourlyPrice = 0;
      planHours = 0;
      aBasePrice = 0;
      aHourlyPrice = 0;
      aPlanHours = 0;
      bBasePrice = 0;
      bHourlyPrice = 0;
      bPlanHours = 0;
      cBasePrice = 0;
      cHourlyPrice = 0;
      String switchString = "";
      
      // Switch statement to initalize selected-plan-total variable prices.
      // Initalizes price variables for both unselected plans
      switch (planString) 
      {
         
         
         case "a":  
         
         basePrice = 9.95;
         hourlyPrice = 2.00;
         planHours = 10;
         bBasePrice = 13.95;
         bHourlyPrice = 1.00;
         bPlanHours = 20;
         cBasePrice = 19.95;
         cHourlyPrice = 0.00;
         break;
         
                  
         case "b":  
         
         basePrice = 13.95;
         hourlyPrice = 1.00;
         planHours = 20;
         aBasePrice = 9.95;
         aHourlyPrice = 2.00;
         aPlanHours = 10;
         cBasePrice = 19.95;
         cHourlyPrice = 0.00;
         break;
         
                  
         case "c":  
         
         basePrice = 19.95;
         hourlyPrice = 0.00;
         aBasePrice = 9.95;
         aHourlyPrice = 2.00;
         aPlanHours = 10;
         bBasePrice = 13.95;
         bHourlyPrice = 1.00;
         bPlanHours = 20;
         break;
         
         default:
          
         switchString = "Invalid input.";
         break;
        }
      
      // Check for plan overages.
      if(hoursUsed - planHours <= 0)
      {
          System.out.println("----------------------------------------");
          System.out.printf("%-15s%6.2f%n", "Total Cost", basePrice);
          System.out.println("----------------------------------------");
      }
      
      // If over or unlimited calculate totalBill.
      else
      {
          billTotal = (((hoursUsed - planHours)*hourlyPrice)+basePrice);
          System.out.println("----------------------------------------");
          System.out.printf("%-15s%6.2f%n", "Total Cost", billTotal);
          System.out.println("----------------------------------------");
      }
      
      
      // Check to see if plan A was initialized.
      if(aBasePrice > 0)
      {
          // Check for plan A overages.
          if((hoursUsed - aPlanHours) <= 0)
          {
              System.out.printf("%-15s%6.2f%n", "Plan A Cost", aBasePrice);
          }
          
          // If over calculate plan A total.
          else
          {    
              aBillTotal = (((hoursUsed - aPlanHours)*aHourlyPrice)+aBasePrice);
              System.out.printf("%-15s%6.2f%n", "Plan A Cost", aBillTotal);
          }
      }
      
      // Check to see if plan B was initalized.
      if(bBasePrice > 0)
      {
      
          // Check for plan B overages.
          if((hoursUsed - bPlanHours) <= 0)
          {
              System.out.printf("%-15s%6.2f%n", "Plan B Cost", bBasePrice);
          }
          
          // If over calculate plan B total.
          else
          {    
              bBillTotal = (((hoursUsed - bPlanHours)*bHourlyPrice)+bBasePrice);
              System.out.printf("%-15s%6.2f%n", "Plan B Cost", bBillTotal);
          }
      }
      
      // Check to see if plan C was initalized.
      if(cBasePrice > 0)
      {
          // Print plan C price.
          System.out.printf("%-15s%6.2f%n", "Plan C Cost", cBasePrice);
      }
      
      // END OF IF-STATEMENT INPUT TEST
      }
      // END OF IF_STATEMENT INPUT TEST 
      
      
      // If input is incorrect, print error message.
      else
      {
      System.out.println("Error: Please enter A, B or C."); 
      }      
   }
}
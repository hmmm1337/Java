// Bennett Siegel
// CS110
// CH 2. #9

import java.util.Scanner;

public class MpgCalc
{
   public static void main(String [] args)
   {
      // Variables
      double mpg, milesDriven, gasUsed;
      
      // Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user for data
      System.out.print("Miles driven: ");
      milesDriven = input.nextDouble();
      
      System.out.print("Gas used: ");
      gasUsed = input.nextDouble();
      
      // Calculate Tax
      mpg = (milesDriven / gasUsed);      
      // Print and Format
      System.out.printf("%-15s%6.2f%n", "Miles Driven", milesDriven);
      System.out.printf("%-15s%6.2f%n", "Gas Used", gasUsed);
      System.out.printf("%-15s%6.2f%n", "MPG", mpg);
      
   }
}
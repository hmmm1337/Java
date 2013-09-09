// Bennett Siegel
// CS110
// CH 2. #17

import java.util.Scanner;

public class JoeStockCalc
{
   public static void main(String [] args)
   {
      // Constants
      double NUM_OF_SHARES = 1000;
      double COMMISSION = 0.02;
      double BUY_PRICE = 32.87;
      double SELL_PRICE = 33.92;
      
      // Variables
      double totalBuy, totalSell, commissionBuy, commissionSell, profit;
      
      // Price to buy 1000 shares
      totalBuy = BUY_PRICE * NUM_OF_SHARES;
      System.out.printf("%-15s%6.2f%n", "Buy Cost", totalBuy);
      
      // Commission to buy 1000 shares
      commissionBuy = totalBuy * COMMISSION;
      System.out.printf("%-15s%6.2f%n", "Buy Com.", commissionBuy);
      
      // Price to sell 1000 shares
      totalSell = SELL_PRICE * NUM_OF_SHARES;
      System.out.printf("%-15s%6.2f%n", "Sell Cost", totalSell);
      
      // Commission to sell 1000 shares
      commissionSell = totalSell * COMMISSION;
      System.out.printf("%-15s%6.2f%n", "Sell Com.", commissionSell);
      
      // Profit
      profit = ((totalSell - totalBuy)-(commissionBuy + commissionSell));
      System.out.printf("%-15s%6.2f%n", "Profit", profit);

      
   }
}
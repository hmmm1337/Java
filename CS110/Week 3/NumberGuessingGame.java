// Bennett Siegel
// CS 110
// Number Guessing Game

import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame
{
   public static void main(String [] args)
   {
      // Variables
      int userGuess;
      int randomNumber;
      
      // Change guessNum to alter the amount of guesses
      int guessNum = 5;
      
      // Constants
      // Change UPPER_LIMIT and LOWER_LIMIT to change the range of the rng.
      final int LOWER_LIMIT = 1;
      final int UPPER_LIMIT = 10;
      
      System.out.println("I'm thinking of a number between " + LOWER_LIMIT + " and " + UPPER_LIMIT + "."); 
      
      // Create input Scanner.
      Scanner input = new Scanner(System.in);
      
      // Generate random number from LOWER_LIMIT to UPPER_LIMIT.
      Random randomGen = new Random();
      randomNumber = randomGen.nextInt(UPPER_LIMIT) + LOWER_LIMIT;
      
      // Get the initial user guess.
      System.out.print("Guess a number: "); 
      userGuess = input.nextInt();
      userGuess = userGuess -1;
      
      // Loop through number of remaining guesses and check if correct.
      while(guessNum > 0)
      {
      
         // If guess is wrong and still have guesses, prompt another guess
         if (userGuess != randomNumber)
         {
         
            // If the guess is too high, inform the user and prompt another guess.
            if(userGuess > randomNumber)
            {
               System.out.println("Too high. Try again.");
               System.out.println("You have " + guessNum + " guesses left.");
               System.out.print("Guess a number: "); 
               userGuess = input.nextInt();
            }
            
            // If the guess is too low, inform the user and prompt another guess.
            else
            {
               System.out.println("Too low. Try again.");
               System.out.println("You have " + guessNum + " guesses left.");
               System.out.print("Guess a number: "); 
               userGuess = input.nextInt();
            }
            
            // Remove a guess from total tally on every iteration.
            guessNum = guessNum - 1;
         }
         
         // If the user guesses the correct number, set guesses to -1 to end iterations
         // and print winning string.
         else
         {
            System.out.println("You Win. Good Job!");
            guessNum = -1;
         }
             
      }
      
      // If the user guesses down to zero, the while loop will terminate and this losing
      // string will print.
      if(guessNum == 0)
      {
         System.out.println("You are out of guesses. Try again!");
      }
   }
}
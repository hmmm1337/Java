// Bennett Siegel
// CS 110
// CH. 4 # 5

import java.util.Scanner;

public class LetterCounter
{
   public static void main(String [] args)
   {
      // Variables
      String wordInput;
      int wordLength, letterCount = 0;
      char letterCheck;
      
      // Constant
      
      // Scanner
      Scanner input = new Scanner(System.in);
      
      // Prompt user for input word.
      System.out.print("Please enter a word: ");
      wordInput = input.nextLine();
      
      // Prompt user for letter to check.
      System.out.print("Please enter a character: ");
      letterCheck = input.next().trim().charAt(0);
      
      // Get the length of the string.
      wordLength = wordInput.length();
      
      for(int i = 0; i < wordLength; i++)
      {
         if(letterCheck == (wordInput.charAt(i)))
         {
            letterCount = letterCount + 1;
         }
      }
      
      System.out.println("That character " + letterCheck + " appears " + letterCount + " times.");
      
   }
   
}
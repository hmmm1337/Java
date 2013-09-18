// Bennett Siegel
// CS110
// File Letter Counter

import java.io.*;
import javax.swing.JOptionPane;

public class FileLetterCounter
{
   public static void main(String [] Args)throws IOException
   {
   
      // Variables
      int letterCount = 0;
      char testChar;
      String fileIn, textLine, testString;
      
      // Get filename input.
      fileIn = JOptionPane.showInputDialog(null, "Input file name?");
      
      // Open the input file to be read.
      FileReader readFile = new FileReader(fileIn);
      BufferedReader readFileInput = new BufferedReader(readFile);
      
      // Get char to test.
      testString = JOptionPane.showInputDialog(null, "Character to test?");
      testChar = testString.charAt(0);
      
      // Read the first line of text and save to string.
      textLine = readFileInput.readLine();
      
      // Loop through all lines until empty.
      while(textLine != null)
      {
         for(int i = 0; i < textLine.length(); i++)
         {
            if(testChar == (textLine.charAt(i)))
            {
               letterCount = letterCount + 1;
            }
         }
         textLine = readFileInput.readLine();
      }
      
      
      // Close files.
      readFileInput.close();
      
      JOptionPane.showMessageDialog(null, "The file '" + fileIn + "' contains " + letterCount
      + " '" + testChar + "'.");
     
      
      
      
  
      
    
   }
}
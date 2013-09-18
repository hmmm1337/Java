// Bennett Siegel
// CS110
// Uppercase File Converter

import java.io.*;
import javax.swing.JOptionPane;

public class UppercaseFileConverter
{
   public static void main(String [] Args)throws IOException
   {
   
      // Variables
      String fileIn, fileOut, textLine;
      
      
      // Get filename input.
      fileIn = JOptionPane.showInputDialog(null, "Input file name?");
      fileOut = JOptionPane.showInputDialog(null, "Output file name?");
      
      // Open the input file to be read.
      FileReader readFile = new FileReader(fileIn);
      BufferedReader readFileInput = new BufferedReader(readFile);
      
      // Open output file to be written to.
      FileWriter writeFile = new FileWriter(fileOut);
      BufferedWriter writeFileOutput = new BufferedWriter(writeFile);
      
      // Read the first line of text and save to string.
      textLine = readFileInput.readLine();
      
      // Loop through all lines until empty.
      while(textLine != null)
      {
         // Convert each line to all uppercase, write to file then
         // also write a new line. 
         textLine = textLine.toUpperCase();
         writeFileOutput.write(textLine);
         writeFileOutput.newLine();
         textLine = readFileInput.readLine();
      }
      
      
      // Close both files.
      readFileInput.close();
      writeFileOutput.close();
        
   }
}
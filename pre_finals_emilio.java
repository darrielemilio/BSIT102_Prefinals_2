/**
 * @(#)pre_finals_emilio.java
 *
 * pre_finals_emilio application
 *
 * @author 
 * @version 1.00 2019/10/14
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.io.FileWriter;
import java.util.Base64;

public class pre_finals_emilio {
    
    public static void main(String[] args)  throws IOException {
    	
    Scanner sc = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();      //An ArrayList that accepts Strings 
    boolean Running = true;                                 // A Bool that has a default value of true
		
	System.out.println("PLEASE ENTER WORDS");	   //Enter the Words 
		while(Running == true)                          // sets the while of the bool to true
		{
			String letter = sc.next();               //Shows input while the bool is true
		if (!letter.equals(":q")) {	                   // if the user inputs a :q  
                   byte[] encode = Base64.getEncode().encode((letter + "\n").getBytes());   // Put the Encoded words into an array that can be used for multiple inputs      
		}
                else {                                        // the bool sets to false state after input :q
                   Running = false;                           
                   System.out.println("Enter your FileName");            // Enter the Set Filename 
                   String Filename = sc.next();                      // The Input to type the Filename
                   writter files = new FileWritter(Filename + ".DAR"); // To save the Input file into a file with an extension

                   for (String a: word                                  // a for loop for ArrayList 
                   {
                          files.write(a);                                   // Saves ArrayList into the File with an extension
		   }
		          files.close();                         //Closes the File 
                          sc.close();                            //Closes the Scanner
			}
		}
      } 
}

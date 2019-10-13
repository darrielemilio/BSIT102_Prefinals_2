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
    	
    Scanner scan = new Scanner(System.in);
    
		ArrayList<String> words = new ArrayList<String>();
		
		String input = "";
		
		do
		{
			input = scan.nextLine();
			words.add(input);
		}
		while (!input.equals(":q"));
		{
		
			for(String a : words)
			{
				String base64 = Base64.getEncoder() .encodeToString(a.getBytes());
				System.out.println ("Save or Discard?");
				String choose = scan.nextLine();
				
				if(choose.equals("save"))
				{
					FileWriter fw = new FileWriter( base64+".jgh");
					System.out.println("Input File name:");
					fw.write(scan.nextLine());
					break;
				}	
				else
				{
					System.out.println("bahala na");
				}
			}
			
		}
				
		}
}

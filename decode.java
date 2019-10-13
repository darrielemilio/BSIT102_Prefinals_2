/**
 * @(#)decode.java
 *
 * decode application
 *
 * @author 
 * @version 1.00 2019/10/14
 */
 import java.io.File;
import java.io.*;
import java.util.Scanner;

public class decode {
    public static void main(String[]args) throws Exception
		{
			
			System.out.println("Enter the file name :");
			Scanner scn = new Scanner(System.in);
			
			File filer = new File(scn.nextLine() + ".jgh");
			scn = new Scanner(filer);
			
			String lines = scn.nextLine();
			System.out.println(lines);
			
		
			
			
			
		}
}
  
//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 12/1/2020
//Lab  - Sets lab - uniques vs duplicates

import java.io.*;
import java.util.*;
public class Main
{
	public static void main( String args[] ) throws IOException
	{
		// make a Scanner and associate it with "wordSet.dat"
		Scanner file = new Scanner(new File("wordSet.dat"));
		
		// as long as there are Strings in the file
		while (file.hasNextLine())
		{
			// read in a String,
			String input = file.nextLine();
			
			// create a UniquesDupes object with it
			UniquesDupes set1 = new UniquesDupes(input);
			
			// print the object
		  System.out.println(set1);
		}
		
	}
}

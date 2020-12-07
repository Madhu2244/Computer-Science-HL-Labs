//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 11/30/2020
//Lab  - Maps Translator

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Main
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("mapsData.txt"));

		Translator words = new Translator();


		//read in pairs from the file and load the map
		int wordCount = Integer.parseInt(file.nextLine());
    for (int i = 0; i < wordCount; i++)
    {
      String line = file.nextLine();
      words.putEntry(line);
    }

		System.out.println("\n====\tMAP CONTENTS\t====\n\n");

		//print the map
    

	  System.out.println(words+"\n\n");


		//read in the lines and convert them
    while (file.hasNextLine())
    {
      String sentence = file.nextLine();
      System.out.println(words.translate(sentence));
    }




	}
}

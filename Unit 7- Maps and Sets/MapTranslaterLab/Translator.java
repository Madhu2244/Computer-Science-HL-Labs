//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 11/30/2020
//Lab  - Maps Translator

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Translator
{
	private Map<String,String> pairs;

	public Translator()
	{
    pairs = new TreeMap<String,String>();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
    pairs.put(list[0],list[1]);
	}

	public String translate(String sent)
	{
  	Scanner chop = new Scanner(sent);  //using the Scanner to read one word at a time from a String
  	String output ="";

  	while (chop.hasNext())
  	{
  	   String s = chop.next();
  	   output += pairs.get(s) + " ";
  	}
  	output = output.substring(0,output.length()-1);
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}

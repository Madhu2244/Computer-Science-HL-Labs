//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 10/1/2020
//Class - 4th period Ms. Horton
//Lab  - ListIterator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class ListIteratorTest
{
	private ArrayList<String> list;
	private String toRemove, replaceWith;

	public ListIteratorTest(String line, String rem, String rep)
	{
	  setTest(line,rem,rep);
	}

	public void setTest(String line, String rem, String rep)
	{
	  list = new ArrayList<String>();
	  this.toRemove = rem;
	  this.replaceWith = rep;
	  String[] arr = line.split(" ");
	  for (int i = 0; i < arr.length; i++)
	  {
	    list.add(arr[i]);
	  }
	}
   
  public void addSecondWord(String newWord)
  {
    ListIterator<String> it = list.listIterator();
    it.next();
    it.add(newWord);
  }
	public void replace()
	{
	  ListIterator<String> it = list.listIterator();
	  while (it.hasNext())
	  {
	    if (it.next().equals(toRemove))
	    {
	      it.set(replaceWith);
	    }
	  }
	}

	public String toString()
	{
		ListIterator<String> iter = list.listIterator();
		String index = "";
		String output = "";
		while (iter.hasNext())
	  {
	    index = iter.next();
	    output += index + ", ";
	  }
	  String outputFormatted = "[" + output.substring(0,output.lastIndexOf(",")) + "]";
	  return outputFormatted;
	}
}

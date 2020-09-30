//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 9/30/2020
//Class - Ms. Horton 4th period
//Lab  - Iterator Practice

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorTest
{
	private ArrayList<String> list;
	private String toRemove;
	//private Iterator<String> it;

	public IteratorTest(String line, String rem)
	{
	  setTest(line, rem);
	}

	public void setTest(String line, String rem)
	{
	  list = new ArrayList<String>();
	  this.toRemove = rem;
	  String[] arr = line.split(" ");
	  for (int i = 0; i < arr.length; i++)
	  {
	    list.add(arr[i]);
	  }
	}

	public void remove()
	{
	  Iterator<String> it = list.iterator();
	  while (it.hasNext())
	  {
	    if (it.next().equals(toRemove))
	    {
	      it.remove();
	    }
	  }
	}

	public String toString()
	{
		Iterator<String> iter = list.iterator();
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

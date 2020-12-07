//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 12/1/2020
//Lab  - Sets lab - uniques vs duplicates

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

public class UniquesDupes
{
	private ArrayList<String> list;


	/**
	 * constructs a UniquesDupes object such that list contains the space delimited strings
	 * parsed from input
	 * @param input a String containing the list of words separated by spaces
	 */
	public UniquesDupes(String input)
	{
    String inputArr[] = input.split(" ");
    list = new ArrayList<String>(Arrays.asList(inputArr));
	}
		
	/**
	 * returns a set of Strings containing each unique entry in the list
	 */
	public Set<String> getUniques()
	{
		Set<String> uniques = new TreeSet<String>();
    for (int i = 0; i < list.size(); i++)
    {
      uniques.add(list.get(i));
    }
		return uniques;
	}
	
	/**
	 * returns a set of Strings containing each entry in the list that occurs more than once
	 */
	public Set<String> getDupes()
	{
		Set<String> uniques = new TreeSet<String>();
		Set<String> dupes = new TreeSet<String>();
    for (int i = 0; i < list.size(); i++)
    {
      if (uniques.add(list.get(i)) == false)
        dupes.add(list.get(i));
      else
        uniques.add(list.get(i));
    }
		//return uniques;
		return dupes;
	}

	/**
	 * returns the original list, the list of duplicates and the list of uniques
	 * @return the String version of the object
	 */
	public String toString()
	{
		return "Orig list :: " + list
		      + "\nDuplicates :: " + getDupes()
		      + "\nUniques :: " + getUniques() + "\n\n";
	}
}

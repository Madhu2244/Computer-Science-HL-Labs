//© A+ Computer Science  -  www.apluscompsci.com
//Name - Madhu Sharma
//Date - 10/1/2020
//Class - 4th period Ms. Horton
//Lab  - ListIterator

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Main
{
	public static void main ( String[] args )
	{
	  ListIteratorTest one = new ListIteratorTest("a b c a b c", "a", "+");
    one.replace();
    one.addSecondWord("newWord");
    System.out.println(one.toString());
    
    one.setTest("a b c d e f g h i j x x x x", "x", "7");
    one.replace();
    one.addSecondWord("newWord");
    System.out.println(one.toString());
    
    one.setTest("11 22 33 44 55  aa bb cc aa bb cc", "bb", "##");
    one.replace();
    one.addSecondWord("##");
    System.out.println(one.toString());
    
    one.setTest("abc abc bcd abd Abd Abc Abc aBc abc", "abc", "none");
    one.replace();
    one.addSecondWord("newWord");
    System.out.println(one.toString());
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Main 
{
  public static void main(String[] args) 
  {
    //Creating my first List
    IteratorTest one = new IteratorTest("a b c a b c a a", "a");
    one.remove();
    System.out.println(one.toString());
    
    //Creating my second List
    IteratorTest two = new IteratorTest("a b c d e f g h i j x x x x x", "x");
    two.remove();
    System.out.println(two.toString());
    
    //Creating my third List   
    IteratorTest three = new IteratorTest("1 2 3 4 5 6 a b c a b c b", "b");
    three.remove();
    System.out.println(three.toString());
    
    
    
    //Output:
    [b, c, b, c]
    [a, b, c, d, e, f, g, h, i, j]
    [1, 2, 3, 4, 5, 6, a, c, a, c]
  }
}

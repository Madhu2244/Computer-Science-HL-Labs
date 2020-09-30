import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class Main 
{
  public static void main(String[] args) 
  {
    IteratorTest one = new IteratorTest("a b c a b c a a", "a");
    one.remove();
    System.out.println(one.toString());

    one.setTest("a b c d e f g h i j x x x x x", "x");
    one.remove();
    System.out.println(one.toString());
    
    one.setTest("1 2 3 4 5 6 a b c a b c b", "b");
    one.remove();
    System.out.println(one.toString());
    
    one.setTest("c i test cc c cccc more c c more chars c", "c");
    one.remove();
    System.out.println(one.toString());
  }
}

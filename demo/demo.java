import java.util.*;
/**
 * Write a description of class demo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class demo
{
    public static void main(String [] args)
    {
      ArrayList<String> al = new ArrayList<String>();
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      Iterator iter= al.iterator();
      
      iter.next();
      iter.remove();
      iter.next();
      iter.remove();
      iter.remove();
      iter.next();
      iter.remove();
      System.out.println(al);
    }
}

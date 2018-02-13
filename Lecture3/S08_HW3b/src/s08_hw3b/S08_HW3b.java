/**
 *
 * Author : Jonathan Fishkin
 * Cite: Suhail Mansuri
 */


package s08_hw3b;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class S08_HW3b {

    public static void main(String[] args) throws Exception {
      FileReader fr = new FileReader("hw3b.text");
      Scanner s = new Scanner (new BufferedReader(fr));
      ArrayList list = new ArrayList(); 
      double sum = 0;
      
      while (s.hasNext()){
          double i = s.nextDouble();
          list.add(i);
          sum = sum + i;
             
      }
      Collections.sort(list);
      double average = sum/list.size();
      System.out.println("sorted list: " + list);
      System.out.println("Average of sorted list: " + average);
      System.out.println("Min: " + list.get(0));
      System.out.println("Max: " + list.get(list.size() - 1));
      
    }
    
}
